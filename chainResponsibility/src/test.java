import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Chain err = new errorLogger();
        Chain warn = new warningLogger();
        Chain clg = new consoleLogger();

        err.setNextChain(warn);
        warn.setNextChain(clg);

        Scanner sc= new Scanner(System.in);
        String text = sc.nextLine();
        Message request = new Message(text);
        err.write(request);
    }
}
