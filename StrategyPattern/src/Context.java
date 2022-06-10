public class Context {
    private Strategy strategy;

    public  Context(Strategy strategy){
        this.strategy = strategy;
    }

    public String executeStrategy(String msg){
        return strategy.doLoadshedding(msg);
    }
}
