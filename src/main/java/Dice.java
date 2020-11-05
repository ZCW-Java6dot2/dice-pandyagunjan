import java.util.Random;

public class Dice {
    Integer diceRolled;

    public Dice(Integer diceRolled) {
        this.diceRolled=diceRolled;
    }

    public Integer tosssAndSum()
    {
        Integer sum=0;
        int max=6;
        int min =1;
     //   Random random=new Random();
        for(i=0;i<diceRolled;i++)
        {
            sum+=Math.random()*(max-min+1)+min;

        }
   return sum;
    }
}
