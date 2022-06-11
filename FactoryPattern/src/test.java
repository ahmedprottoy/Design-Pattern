public class test {

    public static void main(String[] args) {
        Factory factory = new Factory();

        Notification not = factory.createObj("Sound");
        not.sendAlert();

        not = factory.createObj("silent");
        not.sendAlert();

        not = factory.createObj("vibration");
        not.sendAlert();
    }
}
