import java.util.Random;

public class Dice {
    Integer diceRolled;

    public Dice(Integer diceRolled) {
        this.diceRolled=diceRolled;
    }

    public Integer tossAndSum()
    {
        Integer sum=0;
        int max=6;
        int min =1;
        Random random=new Random();
        for(int i=0;i<diceRolled;i++)
        {
            sum+=random.nextInt(6)+1;
           //sum+=(Math.random()*(max-min+1)+min);

        }
        return sum;
    }

    public Integer getDiceRolled()
    {
        return this.diceRolled;
    }
}
