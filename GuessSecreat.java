public class GuessSecreat {
    public static void main(String[] args) {
        int secretNumber=75;
        int guess=60;
        if (secretNumber==guess)
        {
            System.out.println("Correct guess");
        }
        else if(guess > secretNumber)
        {
            System.out.println("to high");
        }
        else if (guess<secretNumber) {
            System.out.println("to low");
        }
        
    }
}
/*Let's switch to a classic interview problem.

Problem #9 – Number Guess Validation
int secretNumber = 75;
int guess = 60;

Print:

"Correct Guess" if guess == secretNumber
"Too High" if guess > secretNumber
"Too Low" if guess < secretNumber
Rules
Use only if-else if-else.
No loops.
No user input. */