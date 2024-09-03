import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value : ");
        double a = input.nextDouble();
        System.out.print("Enter b value : ");
        double b = input.nextDouble();
        System.out.print("Enter c value : ");
        double c = input.nextDouble();

        double D = b*b-4*a*c;

        if (D==0) {
            double root = -b/2*a;
            System.out.println("The Roots is : " + root);
        }
        else if (D>0) {
           double root1 = (-b + Math.sqrt(D)) / (2 * a);
           double root2 = (-b - Math.sqrt(D)) / (2 * a);

           System.out.println("Root1 : " + root1 + " and root2 : " + root2);
        }
        else if (D<0) {
            System.out.println("The roots are complex.");
        }

        input.close();
    }
    
}