
import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the sphere : ");
        double radius = input.nextDouble();
        double volume = (4.0 / 3.0) * Math.PI * (radius * radius * radius);

        System.out.println("The volume of the sphere is : " + volume);
        input.close();
    }
}
