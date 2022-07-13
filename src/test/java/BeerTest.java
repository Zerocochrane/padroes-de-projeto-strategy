import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeerTest {

    @Test
    public void deveRetornarAle(){
        Beer beer = new Ale();
        assertEquals("Beba uma Ale", beer.drink());
    }

    @Test
    public void deveRetornarIPA(){
        Beer beer = new IPA();
        assertEquals("Beba uma IPA", beer.drink());
    }

    @Test
    public void deveRetornarStout(){
        Beer beer = new Stout();
        assertEquals("Beba uma Stout", beer.drink());
    }

}