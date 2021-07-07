
import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void diceConstructorTest() {
        Dice dice = new Dice(5);
        Integer expected = 5;

        Assert.assertEquals(expected, dice.getDiceRolled());
    }

    @Test
    public void diceConstructorTest1() {
        Dice dice = new Dice(2);
        Integer expected = 2;

        Assert.assertEquals(expected, dice.getDiceRolled());
    }
    @Test
    public void tossAndSumTestFor2() {
        Dice dice = new Dice(2);
        Integer actual = dice.tossAndSum();

        Assert.assertTrue(actual >=2 && actual <=12);
    }
    @Test
    public void tossAndSumTestFor5() {
        Dice dice = new Dice(5);
        Integer actual = dice.tossAndSum();

        Assert.assertTrue(actual >=5 && actual <=30);
    }

}