import java.util.ArrayList;

public class Subject {

    int run;
    int wicket;
    float overs;

    private ArrayList<Observer> observer = new ArrayList<>();

    public int getRun(){
        return run;
    }
    public int getWicket(){
        return wicket;
    }
    public float getOvers(){
        return overs;
    }


//    public void dataChange(int run,int wicket,float overs){
//this.run=run;
//this.wicket=wicket;
//this.overs=overs;
//
//
//        notifyAllObservers();
//
//    }

    public void addObserver(Observer o){
        observer.add(o);
    }

    public void notifyAllObservers(int run,int wicket,float overs){
        this.run=run;
        this.wicket=wicket;
        this.overs=overs;
        for(Observer o : observer){
            o.update(run,wicket,overs);
        }
    }




}
