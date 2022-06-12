public class GenFactory {

    public static GUIFactory getFactory(boolean fac){
        if(fac){
            return new WinFactory();
        }else{
            return new MacFactory();
        }
    }

}
