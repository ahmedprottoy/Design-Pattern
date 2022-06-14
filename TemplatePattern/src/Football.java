public class Football extends Temp{

public int goals;

public Football(int goals){
    this.goals=goals;
}
    @Override
    public void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    public void wicket( ) {

    }



    @Override
    public void goals( ) {
        System.out.println(goals+" goals scored");
    }

    @Override
    public void endPlay() {
        System.out.println("Football Game Over!");
    }
}
