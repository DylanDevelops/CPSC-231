package Projects.MP3B_ERS;

/**
 * Name: Dylan M. Ravel
 * Student ID: 2445987
 * Chapman Email: ravel@chapman.edu
 * Course Number and Section: CPSC-231-02
 * Assignment: MP3B: ERS
**/

public class Driver {
    public static void main(String[] args) {
        Game game = new Game(4);

        int winner = game.play();

        System.out.println("The winner is: " + winner);
    }
}
