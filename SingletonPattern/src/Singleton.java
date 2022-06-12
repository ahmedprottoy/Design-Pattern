public class Singleton {

    private Singleton(){};

    public static Singleton instance;

    public static Singleton getObj(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }

    public void display(){
        System.out.println("object created");
    }
}
