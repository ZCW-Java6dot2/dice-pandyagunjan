import java.util.ArrayList;
public class Bins {

    Integer first;
    Integer last ;
    ArrayList<Integer> tracker;
   // Simulation sim=new Simulation(2,10000);

    public Bins(Integer first , Integer last )
    {
        this.first=first;
        this.last=last;
        this.tracker=new ArrayList<Integer>();
        for(int i=0 ; i <= last ; i ++)
        {
            this.tracker.add(0);
        }
    }

    public void incrementBin(Integer indexForCounter)
    {
        Integer a=tracker.get(indexForCounter);
        a++;
        tracker.set(indexForCounter,a);

    }

  public Integer getBin(Integer index)
    {
        return tracker.get(index);
    }
}
