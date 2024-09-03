import java.util.Scanner;

public class StudentMarksCalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Roll Number : ");
        int rollNumber = input.nextInt();
        System.out.print("Enter Subject 1 marks : ");
        int subject1 = input.nextInt();
        System.out.print("Enter Subject 2 marks : ");
        int subject2 = input.nextInt();
        System.out.print("Enter Subject 3 marks : ");
        int subject3 = input.nextInt();
        int totalMarks = subject1 + subject2 + subject3;
        int percentage = totalMarks/3;
        
        String division;
        if (percentage <= 100 && percentage >=80) {
            division = "First Division";
        }else if (percentage <= 80 && percentage >= 60) {
            division = "Second Division";
        } else if (percentage <= 60 && percentage >= 40) {
            division = "Third Division";
        }else{
            division = "Failed";
        }
       
        System.out.println("Student Roll Number : " + rollNumber);
        System.out.println("Student Total Marks : " + totalMarks);
        System.out.println("Student Obtain Percentage : " + percentage);
        System.out.println("Student Obtain Division : " + division);
        input.close();
    }
}
