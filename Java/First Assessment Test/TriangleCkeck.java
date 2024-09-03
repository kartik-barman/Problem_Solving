import java.util.Scanner;

public class TriangleCkeck {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length side 1 : ");
        double side1 = input.nextDouble();
        System.out.print("Enter the length side 2 : ");
        double side2 = input.nextDouble();
        System.out.print("Enter the length side 3 : ");
        double side3 = input.nextDouble();

        if (side1 == side2 && side2 == side3) {
            System.out.println("The Triangle is Equilateral" );
        }else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("The Triangle is Isosceles"); 
        }else if(!(side1 == side2 && side2 == side3)){
            System.out.println("The Triangle is Scalene" );
        }
        
        input.close();
    }
}
