import java.util.Scanner;

public class new_project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = (int) (Math.random() * 100); // Generate a random number between 0 and 99
        int guess;
        int attempts = 0;
        //welcome message for my geussing game
        System.out.println("Welcome to the Guessing Game!");
    // function to initiate the game
        do {
            System.out.print("Enter your guess (between 0 and 99): ");
            guess = scanner.nextInt();
            attempts++;
// function to determine if the guess is too high or too low
            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed it right in " + attempts + " attempts.");
            }
        } while (guess != numberToGuess);
// close the scanner after the loop ends
        scanner.close();
    }
}
