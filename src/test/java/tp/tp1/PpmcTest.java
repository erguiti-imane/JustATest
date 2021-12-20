package tp.tp1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PpmcTest {

    Ppmc ppmc;

    @Before
    public void setUp() throws Exception {
        this.ppmc = new Ppmc();
    }

    @Test
    public void testppmc(){
        assertEquals(60,ppmc.ppcm(12,15));
    }
}