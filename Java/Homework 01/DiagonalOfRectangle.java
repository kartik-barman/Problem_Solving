import java.util.Scanner;

public class DiagonalOfRectangle {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of a rectangle : ");
        double length = input.nextDouble();
        System.out.print("Enter the Width of a rectangle : ");
        double Width = input.nextDouble();

        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(Width, 2));

        System.out.println("The diagonal of the rectangle is : " + diagonal);

        input.close();
    }
}
