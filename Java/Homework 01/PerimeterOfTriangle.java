import java.util.Scanner;

/**
 * PerimeterOfTriangle
 * Perimeter = a+b+c
 */
public class PerimeterOfTriangle {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side 1 value : ");
        float side1 = input.nextFloat();
        System.out.print("Enter side 2 value : ");
        float side2 = input.nextFloat();
        System.out.print("Enter side 3 value : ");
        float side3 = input.nextFloat();

        float perimeter = (side1 + side2 + side3);

        System.out.println("Perimeter of a triangle : " + perimeter);

        input.close();
    }
}