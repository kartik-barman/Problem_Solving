import java.util.Scanner;

public class SumOfAllDigit {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three digit number : ");
        int number = input.nextInt();

        int firstDigit = number / 100;
        int secondDigit = (number / 10) % 10;
        int thirdDigit = number % 10;

        int sum = firstDigit + secondDigit + thirdDigit;

        System.out.println(number + " => " + firstDigit+ "+" + secondDigit + "+" + thirdDigit + " = " + sum);

        int sumFirstDigit = (sum / 10) % 10;
        int sumLastDigit = sum % 10;

        int result = sumFirstDigit + sumLastDigit;

        System.out.println(sum + " => " + sumFirstDigit + "+" + sumLastDigit + " = " + result);

        input.close();
    }
}