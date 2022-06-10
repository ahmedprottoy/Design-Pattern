public class Regular implements Strategy {

    @Override
    public String doLoadshedding(String msg) {
        System.out.println(msg+ " Loadshedding occured");
        return msg;
    }
}
