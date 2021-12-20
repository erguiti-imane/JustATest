package tp.tp1;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class FactureTest {

    Facture facture;
    Ifacture ifacture;

    @Before
    public void setUp(){

        this.facture= new Facture();
        this.ifacture = Mockito.mock(Ifacture.class);
    }

    @Test
    public void testgetFraisTransport(){
        assertEquals(45,facture.getFraisTransport(500),0);
        assertEquals(0,facture.getFraisTransport(700),0);
    }

    @Test
    public void testgetMontantFacture(){
        when(ifacture.getMontantFacture()).thenReturn(500.0);
        assertEquals(500,ifacture.getMontantFacture(),0);
    }


}