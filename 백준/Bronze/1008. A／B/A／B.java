import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);

       Double A = in.nextDouble();
       Double B = in.nextDouble();

       System.out.println(A/B);

       in.close();
       
    }
}
