import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class BizzBuzzTest {
    private Bizzbuzz bizzbuzz = new Bizzbuzz();

    @Test
    public void testEhDivisivelPorTres() {
        Assert.assertTrue(new Bizzbuzz().ehDivisivelPorTres(3));
    }

    @Test
    public void testNaoEhDivisivelPorTres() {
        Assert.assertFalse(new Bizzbuzz().ehDivisivelPorTres(2));
    }

    @Test
    public void testEhDivisivelPorCinco() {
        Assert.assertTrue(new Bizzbuzz().ehDivisivelPorCinco(5));
    }

    @Test
    public void testNaoEhDivisivelPorCinco() {
        Assert.assertFalse(new Bizzbuzz().ehDivisivelPorCinco(2));
    }

    @Test
    public void testPlayBizzbuzz() {
        //Assert.
    }
}
