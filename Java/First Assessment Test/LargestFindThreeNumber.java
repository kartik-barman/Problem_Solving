import java.util.Scanner;

public class LargestFindThreeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int a = input.nextInt();
        System.out.print("Enter b value : ");
        int b = input.nextInt();
        System.out.print("Enter c value : ");
        int c = input.nextInt();

        if (a>=b && a>=c) {
            System.out.println(a + " is large number");
        }else if (b>=a && b>=c) {
            System.out.println(b + " is large number");    
        }else if(c>=a && c>=b){
            System.out.println(c + " is large number");    
        }
       input.close();
    }
    
}
