import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Collatz {

    void run(){
        // Initialization
        int number;
        int firstNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a Positive Integer: ");

        do{
            try {
                number = scanner.nextInt();
                firstNumber = number;
            }catch (InputMismatchException e){
                number = -1;
                firstNumber = -1;
                System.out.println("that aint a positive integer >:(");
                scanner.next();
            }
        }while (number < 1);

        // Starting the loop
        int timesDone = 0;
        System.out.println("\n" + timesDone + ". " + number);

        do{
            // If the number is even, divide by 2
            if (number % 2 == 0){
                number = number / 2;
            }
            // If the number is odd, multiply by 3 and add 1
            else{
                number = number * 3;
                number++;
            }
            timesDone++;
            System.out.println(timesDone + ". " + number);

        }while (!(number == 1));

        System.out.println("\nAfter " + timesDone + " calculations, " + firstNumber + " has been turned to 1.");

        this.run();
    }
}
