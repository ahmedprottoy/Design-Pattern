public class test {

    public static void main(String[] args) {

        Subject subject = new Subject();

        new CurrentScoreDisplay(subject);
        new AverageScoreDisplay(subject);

        subject.notifyAllObservers(100,5,14.3f);
    }
}
