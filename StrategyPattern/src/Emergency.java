public class Emergency implements Strategy {
    @Override
    public String doLoadshedding(String msg) {
        System.out.println("Emergency Loadshedding occured");
        return msg;
    }
}
