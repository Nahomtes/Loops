import java.util.Scanner;
public class EightLoopProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. A program that prints the numbers 1-10.
        System.out.println("1. A program that prints the numbers 1-10.");
        System.out.print("Numbers 1 to 10: ");
        for (int number = 1; number <= 10; number++)
            System.out.print(number + " ");
        System.out.println("\n");

        // 2. A program that prints the numbers 1-10 backwards.
        System.out.println("2. A program that prints the numbers 1-10 backwards.");
        System.out.print("Numbers 1 to 10 backwards: ");
        for (int number = 10; number >= 1; number--)
            System.out.print(number + " ");
        System.out.println("\n");

        // 3. Write a program that prints all the odd numbers from 1-20.
        System.out.println("3. Write a program that prints all the odd numbers from 1-20.");

        System.out.print("Odd numbers from 1 to 20: ");
        for (int number = 1; number <= 20; number++)
            if (number % 2 != 0)
                System.out.print(number + " ");
        System.out.println("\n");

        // 4. Write a program that prints all the even numbers from 1-20.
        System.out.println("4. Write a program that prints all the even numbers from 1-20.");
        System.out.print("Even numbers from 1 to 20: ");
        for (int number = 1; number <= 20; number++)
            if (number % 2 == 0)
                System.out.print(number + " ");
        System.out.println("\n");

        // 5. Given user input a number, print all the numbers from that input value to 1.
        System.out.println("5. Given user input a number, print all the numbers from that input value to 1.");
        System.out.println("Enter an integer number: ");
        int inputNumber = scanner.nextInt();

        System.out.printf("All the numbers from (%d) to 1: ", inputNumber);

        while (inputNumber != 1) {
            System.out.print(inputNumber + " ");
            if (inputNumber > 1) {
                inputNumber--;
            } else {
                inputNumber++;
            }
        }
        System.out.print(inputNumber);
        System.out.println("\n");

        // 6. Sum all values from 1-10.
        System.out.print("6. Sum of all values from 1 to 10: ");
        int sum = 0;
        for (int number = 1; number <= 10; number++)
            sum += number;

        System.out.print(sum);
        System.out.println("\n");

        // 7. Given a user input a number, print the sum of all numbers from that inputted value to 1.
        System.out.println("7. Given a user input a number, " +
                "print the sum of all numbers from that inputted value to 1.");

        System.out.println("Enter an integer number: ");
        inputNumber = scanner.nextInt();
        int totalSum = 1;

        System.out.printf("Sum of all numbers from (%d) to 1 is: ", inputNumber);

        // If input number is negative or zero
        if (inputNumber < 1) {
            int inputNumberPos = inputNumber * -1;
            totalSum = (inputNumberPos * (inputNumberPos + 1)) / 2;
            totalSum = (totalSum - 1) * -1;
        } else {
            totalSum = (inputNumber * (inputNumber + 1)) / 2;
        }

        System.out.print(totalSum);
        System.out.println("\n");

        // 8. Factorial of a Number
        System.out.println("8. Factorial of a Number");
        System.out.println("Enter an integer: ");
        int inputInt = scanner.nextInt();


        int result = 1;
        if (inputInt < 0) {
            System.out.printf("The factorial of %d is: undefined", inputInt);
        } else if(inputInt == 0) {
            result = 1;
            System.out.printf("The factorial of %d is: %d", inputInt, result);
        }else {
            int copyInputInt = inputInt;
            while(copyInputInt != 1){
                result *= copyInputInt;
                copyInputInt--;
            }
            System.out.printf("The factorial of %d is: %d", inputInt, result);
        }
        System.out.println("\n");
        scanner.close();


        // 9. Write loops to print the following:

       /*
          i)                   ii)                  iii)
            **********            *                             *
            **********            **                          **
            **********            ***                       ***
            **********            ****                    ****
                                  *****                 *****

          */

        // i)
        for(int r = 0; r < 4; r++) {
            for(int c= 0; c < 10; c++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        // ii)
        for(int r = 1; r <= 5; r++) {
            for(int c= 0; c < r; c++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        // iii)
        final int ROW = 5;
        int numberOfAsterisk = 0;
        for(int r = ROW; r > 0; r--) {
            int numberOfSpace = (r - 1) * 2;
            numberOfAsterisk++;
            for(int s = 0; s < numberOfSpace; s++) {
                System.out.print(" ");
            }
            for(int s = 0; s < numberOfAsterisk; s++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("");

    }
}

