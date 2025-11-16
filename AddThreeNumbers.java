
package add.three.numbers;

import java.util.Random;
import java.util.Scanner;

public class AddThreeNumbers {

    public static void main(String[] args) {
Random rand = new Random();
        int num1 = rand.nextInt(10);
        int num2 = rand.nextInt(10);
        int num3 = rand.nextInt(10);

        Scanner input = new Scanner(System.in);
        System.out.print("What is " + num1 + " + " + num2 + " + " + num3 + "? ");
        int answer = input.nextInt();

        if (answer == num1 + num2 + num3) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The answer is " + (num1 + num2 + num3));
        }

    }
    
}
