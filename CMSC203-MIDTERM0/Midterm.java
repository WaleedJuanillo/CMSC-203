import java.util.Scanner;

public class Midterm {
    public static void main(String[] args) throws Exception {
        while (true) {
            
            Scanner scan = new Scanner(System.in);
            
            do {
                System.out.print("Number of Test Cases: ");
                int q = scan.nextInt();

                if (1 <= q && q <= 31) {
                    String inputs[] = new String[q];

                    for (int i = 0; i < q; i++) {                       
                        int ints;

                        System.out.print("Number of Holidays: ");
                        scan = new Scanner(System.in);
                       
                        inputs[i] = scan.nextLine();
                       
                        System.out.print("Day of Holidays: ");
                        scan = new Scanner(System.in);     

                        inputs[i] = scan.nextLine();
                                                                             
                    }
                    

                } else
                    System.out.println("Enter 1 to 31 Day(s) only!");

            } while (true);

        }
    }
}