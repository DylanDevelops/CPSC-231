/**
 * Name: Dylan M. Ravel
 * Student ID: 2445987
 * Chapman Email: ravel@chapman.edu
 * Course Number and Section: CPSC-231-02
 * Assignment: MP3B: ERS
**/

public class Driver {
    public static void main(String[] args) {
        // Creates a new game with 4 players
        Game game = new Game(4);

        // Plays the game and saves the winner as a result.
        int winner = game.play();

        // Prints out the winner of the game.
        System.out.println("\n🥳 The winner is: Player #" + winner + "! 🎉");
    }
}
