import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayL {

    public void run() {
        ArrayList<Integer> userNumbers = new ArrayList<Integer>();
        Scanner userInput = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("\nType a number ");
            userNumbers.add(Integer.parseInt(userInput.nextLine()));

        }

        System.out.println(userNumbers.toString());

        double sum = 0;
        for (int i : userNumbers) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        int prod = 1;
        for (int j : userNumbers) {
            prod *= j;
            
        }
        System.out.println("Product: " + prod);

        System.out.println("Smallest Number: " + Collections.min(userNumbers));
        System.out.println("Largest Number: " + Collections.max(userNumbers));
    }

}
