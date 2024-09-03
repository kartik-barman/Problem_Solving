import java.util.Scanner;

public class DetermineQuadrant {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter X-coordinate Value : ");
        int x = input.nextInt();
        
        System.out.print("Enter Y-coordinate Value : ");
        int y = input.nextInt();

        if (x>0 && y>0) {
            System.out.println("The point (" + x + "," + y + ") lies in the first quadrant");
        }else if (x<0 && y>0) {
            System.out.println("The point (" + x + "," + y + ") lies in the second quadrant"); 
        } else if (x<0 && y<0) {
            System.out.println("The point (" + x + "," + y + ") lies in the third quadrant");
        } else if (x>0 && y<0) {
            System.out.println("The point (" + x + "," + y + ") lies in the fourth quadrant");
        }else if (x != 0 && y == 0) {
            System.out.println("The point (" + x + "," + y + ") lies on the X-axis");
        } else if (x == 0 && y != 0) {
            System.out.println("The point (" + x + "," + y + ") lies on the Y-axis");
        }else if (x == 0 && y == 0) {
            System.out.println("The point (" + x + "," + y + ") lies on the Origin");
        }

        input.close();
    }
}
