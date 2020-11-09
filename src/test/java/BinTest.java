
import org.junit.Assert;
import org.junit.Test;


public class BinTest {

    @Test
    public void binsConstructorTest(){
        Bins bins = new Bins(2,12);

        Integer expected = 0;

        Assert.assertEquals(expected, bins.getBin(10));
    }

    @Test
    public void getBinTest(){
        Bins bin1 = new Bins(2,12);
        Integer expected = 0;

        Assert.assertEquals(expected, bin1.getBin(12));
    }

    @Test
    public void incrementTest(){
        Bins bin2 = new Bins(2,12);
        Integer expected = 1;
        bin2.incrementBin(10);

        Assert.assertEquals(expected, bin2.getBin(10));
    }
}
