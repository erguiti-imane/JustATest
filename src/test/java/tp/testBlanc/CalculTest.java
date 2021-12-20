package tp.testBlanc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CalculTest {

    Calcul calcul;
    CalculService calculService;

    @Before
    public void setUp() throws Exception {
        calculService = Mockito.mock(CalculService.class);
        this.calcul = new Calcul(calculService);
     }

    @Test
    public void testcalculNoteIfIntResult() {
        assertEquals(10,calcul.calculNote(10,10),0);
    }

    @Test
    public void testcalculNoteIfDoubleResult(){
        assertEquals(2.5,calcul.calculNote(3,2),0);
    }

    @Test
    public void testcompareIfIdenticalNumbers(){
        assertEquals(2,calcul.calculNote(2,2),0);
    }

    @Test
    public void testCompareIfNotIdenticalNumbers(){
        assertEquals(2.5,calcul.calculNote(2,3),0);
    }

    @Test(expected = ArithmeticException.class)
    public void testcompareIfEqualToZero(){
        calcul.compare(0,0);
    }

    @Test
    public void testCalculSomme(){
        when(calculService.method(2,0)).thenReturn(2);
        assertEquals(2,calcul.calculSomme(2,2),0);
        verify(calculService,times(2)).method(2,0);
    }

    @After
    public void tearDown() throws Exception {
        calcul = null;
        calculService = null;
    }

}