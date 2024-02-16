import java.util.Scanner;

public class Conditionals {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        String favoriteDog = "Swiss Mountain Dog";
        String guess = s.nextLine();

        if(guess.toLowerCase().equals(favoriteDog.toLowerCase())) {
            System.out.println("You guessed my favorite dog!");
        } else {
            System.out.println("You did not guess my favorite dog!");
        }
    }
}
