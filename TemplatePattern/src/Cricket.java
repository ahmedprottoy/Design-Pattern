public class Cricket extends Temp{

    public int wicket;
    public Cricket(int wicket){
        this.wicket=wicket;
    }
    @Override
    public void initialize() {
        System.out.println("cricket Game Initialized! Start playing.");
    }

    @Override
    public void wicket() {

        System.out.println(wicket+" wickets taken");
    }

    @Override
    public void goals( ) {

    }

    @Override
    public void endPlay() {
        System.out.println("cricket Game Over!");
    }
}
