/*
*Choices and Loops
* Use scanner and loops to input numbers to calculate with
* Author:       Jakob Weikhard
*Last change:   06.11.2022
*/
import java.util.Locale;
import java.util.Scanner;

public class ChoiceAndLoops {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int input = 0;
        int sum = 0;
        int min = 0;
        int max = 0;

        while (true) {
            System.out.print("Enter a value: ");
            input = scanner.nextInt();

            if (input > 0) {
                break;
            }
        }


        for (int counter = 1; counter <= input; counter++) {
            System.out.print("# ");
            num = scanner.nextInt();


            if (num < min || counter == 1)
                min = num;


            if (num > max || counter == 0)
                max = num;

            sum += num;

        }
        while (true) {
            System.out.println("Sum: " + sum);
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
            if(scanner.hasNextInt())
                break;
        }

        }
    }
