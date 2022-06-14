public abstract class Temp {
    protected int w;
    public abstract void initialize();
    public final void startPlay(){
        System.out.println("Starting the game...");
    }
    public abstract void wicket();
    public abstract void goals();
    public abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        wicket();
        goals();
        endPlay();
    }
}
