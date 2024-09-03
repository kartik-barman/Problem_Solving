import java.util.Scanner;

public class SumCheckDivisiableNine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three digit number : ");
        int number = input.nextInt();

        int firstDigit = number / 100;
        int secondDigit = (number/10) % 10;
        int thirdDigit = number % 10;

        int sum = firstDigit + secondDigit + thirdDigit;

        String result = number + " => " + firstDigit + "+" + secondDigit + "+" + thirdDigit + " = " + sum;

        if (sum % 9 == 0) {
            System.out.println("The sum(" + result + ") of digits is disiviable by 9");
        }else{
            System.out.println("The sum of digits is not disiviable by 9");
        }

        input.close();
    }
}
