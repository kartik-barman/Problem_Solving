import java.util.Scanner;

public class AreaOfTriagle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side 1 value : ");
        float side1 = input.nextFloat();
        System.out.print("Enter side 2 value : ");
        float side2 = input.nextFloat();
        System.out.print("Enter side 3 value : ");
        float side3 = input.nextFloat();

        float area = (side1 + side2 + side3)/2;

        System.out.println("Area of a triangle : " + area);

        input.close();
    }
}
