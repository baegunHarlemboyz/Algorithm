import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        
        in.close();

        for(int i=1; i<=n; i++){

            for(int y=1; y<=i; y++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    
       
    }
}
