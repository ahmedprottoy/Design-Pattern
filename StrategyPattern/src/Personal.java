public class Personal implements Strategy {
    @Override
    public String doLoadshedding(String msg) {
        System.out.println("Personal Loadshedding occured");
        return msg;
    }
}
