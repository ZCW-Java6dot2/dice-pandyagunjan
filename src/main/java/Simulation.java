
import com.sun.codemodel.internal.JPrimitiveType;

import javax.xml.bind.PrintConversionEvent;
import java.util.Random;


public class Simulation {
    Integer numberOfDies;
    Integer numberOfTosses;
    Integer binLow;
    Integer binHigh;
    Bins bin;
    public Simulation(Integer numberOfDies,Integer numberOfTosses) {
        this.numberOfDies=numberOfDies;
        this.numberOfTosses=numberOfTosses;
        this.binLow=numberOfDies;
        this.binHigh=numberOfDies*6;
        this.bin = new Bins(binLow,binHigh);
    }
    public static void main(String [] args){

        Console console = new Console();
        int diceNumbers=0;
        int numberOfTosses1=0;
        diceNumbers = console.getIntegerInput("\u001B[34m Please enter Number of Dice:\u001B[34m").intValue();
        numberOfTosses1 = console.getIntegerInput("\u001B[34m Please enter Number of Tosses:\u001B[34m\u001B[0m").intValue();
        Simulation simulateToss= new Simulation(diceNumbers,numberOfTosses1);
        simulateToss.runSimulation();
        simulateToss.printResults();
    }
    public void runSimulation()
    {
        Dice rollTheDice= new Dice(numberOfDies);

        //   Integer outputOfToss = rollTheDice.tossAndSum();
        // System.out.println(outputOfToss);
        //  outputOfToss = rollTheDice.tossAndSum();
        //sum+=Math.random()*(max-min+1)+min;
        for(int i=0;i<=this.numberOfTosses;i++) {
            bin.incrementBin(rollTheDice.tossAndSum());
        }

    }


    public void printResults()
    {
        System.out.println("\n***\nSimulation of "+ this.numberOfDies+" dice tossed for "+numberOfTosses+" times.\n***\n");
        for (int i = numberOfDies; i <= numberOfDies*6; i++) {
            float percentage = bin.getBin(i)/(float)numberOfTosses;
            System.out.printf("\n %3d:  %6d:   %.2f %s ",i,bin.getBin(i) ,percentage, printCountStars(percentage));
        }
    }

    public String printCountStars(float percentageNo)
    {
        StringBuilder str=new StringBuilder();

        int numberOfStars = (int)(percentageNo *100) ;
        for (int i = 0; i < numberOfStars; i++) {

            str.append("*");
        }
        return str.toString();
    }
}
