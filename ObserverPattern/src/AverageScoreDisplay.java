public class AverageScoreDisplay implements  Observer{

    private final Subject subject;
    private float runRate;
    private int predictedScore;


    public AverageScoreDisplay(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }
    @Override
    public void update(int run, int wicket, float overs) {
        runRate = (float)run/overs;
        predictedScore = (int)(runRate*50);

        display();
    }

    public void display(){
        System.out.println("\nAverage Score Display: \n"
                + "Run Rate: " + runRate +
                "\nPredictedScore: " +
                predictedScore);
    }
}
