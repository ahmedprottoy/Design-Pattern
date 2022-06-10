public class Urgent implements Strategy {
    @Override
    public String doLoadshedding(String msg) {
        System.out.println("Urgent Loadshedding occured");
        return msg;
    }
}
