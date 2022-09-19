import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        int x;
        int y;
        
       try(Scanner s = new Scanner(System.in)) {

        System.out.print("First Number : ");
        x = s.nextInt();
        
        System.out.print("Second Number : ");
        y = s.nextInt();

        int result = x + y;

        System.out.println();
        System.out.println("Result : " +  x + " + " + y + " = " + result);
       }
    }
}
