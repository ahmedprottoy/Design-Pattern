public class CurrentScoreDisplay implements Observer{


    private final Subject subject;
    private int run;
    private float overs;
    private int wicket;


    public CurrentScoreDisplay(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }
    @Override
    public void update(int run, int wicket, float overs) {
        this.run=run;
        this.overs=overs;
        this.wicket=wicket;

        display();

    }

    public void display(){
        System.out.println("\nCurrent Score Display:\n"
                + "Runs: " + run +
                "\nWickets:" + wicket +
                "\nOvers: " + overs );
    }
}
