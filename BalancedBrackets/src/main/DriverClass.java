package main;
import java.util.Scanner;
import balancedBrackets.BalancedBrackets;

public class DriverClass {
	public static void main(String[] args) {
        // Create an instance of the BalancedBrackets class
        BalancedBrackets bb = new BalancedBrackets();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call the isBalanced method using the instance
        if (bb.isBalanced(input)) {
            System.out.println("The entered String has Balanced Brackets");
        } else {
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }
        sc.close();
    }
}


