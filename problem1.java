import java.util.Scanner;

public class Voting {
   public static void main(String [] args) {
      // Declaring variables
      int age;
      // taking user input
      Scanner scan = new Scanner (System.in);
      System.out.println ("Please enter your age: ");
      age = scan.nextInt ();
      // Checking condition for voting..
      if (age>= 18) {
         System.out.println ("You are eligible for voting.");
      }
   }
}
