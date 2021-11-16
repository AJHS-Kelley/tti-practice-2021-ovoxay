// Grade Calculator Practice, 11/16/2021

   import java.util.Scanner;

   public class Grade
   {
   
    public static void main(String[] args) {
        System.out.println("This program will take a numerical grade between 0 and 100 and print the letter grade. \n");
        double grade; 
        Scanner myScanner = new Scanner(System.in);
        grade = myScanner.nextDouble();

        System.out.println(grade);

        if (grade >= 89.5) {
            System.out.println("That grade is an A. \n");
        }  
        else if (grade >= 79.5) {
            System.out.println("That grade is an B. \n");
        }
        else if (grade >= 69.5) {
            System.out.println("That grade is an C. \n");
        }
        else if (grade >= 59.5) {
            System.out.println("That grade is an D. \n");
        }
        else {
            System.out.println("That grade is an F. \n");
        }
    }
   }