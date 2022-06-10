public class test {
    public static void main(String[] args) {
        Regular reg = new Regular();
        Context context = new Context(reg);
        context.executeStrategy("Regular");

         context = new Context(new Emergency());
        context.executeStrategy("Emergency");

         context = new Context(new Urgent());
        context.executeStrategy("Urgent");

         context = new Context(new Personal());
        context.executeStrategy("Personal");
    }
}
