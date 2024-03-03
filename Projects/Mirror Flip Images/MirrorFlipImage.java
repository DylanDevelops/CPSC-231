/**
 * Name: Dylan M. Ravel
 * Student ID: 2445987
 * Chapman Email: ravel@chapman.edu
 * Course Number and Section: CPSC-231-02
 * Assignment: MP1: Mirror Flipping Images
**/

/**
 * The class used for flipping/mirroring the images
 */
public class MirrorFlipImage {
    /** 
     * Displays the passed in 2D char array in the console.
     * 
     * @param image The 2D char array wanting to be displayed
    */
    private static void displayImage(char[][] image) {
        // Loops through the 2D array and displays to the console leaving a trailing newline
        for(int row = 0; row < image.length; row++) {
            for(int column = 0; column < image[row].length; column++) {
                System.out.print(image[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    /**
     * Horizontally mirrors the passed in the 2D char array
     * 
     * @param image The 2D char array wanting to be horizontally mirrored
     * @return The newly flipped 2D char array
     */
    private static char[][] horizontalMirror(char[][] image) {
        // Creates the new 2D char array with the same sizing as the passed in one
        char[][] newImage = new char[image.length][image[0].length];
        
        // Loops through the 2D array and passes in the horizontally mirrored values to the new 2D char array
        for(int row = 0; row < image.length; row++) {
            for(int column = 0; column < image[row].length; column++) {
                newImage[newImage.length - row - 1][column] = image[row][column];
            }
        }
        return newImage;
    }
    
    /**
     * Vertically mirrors the passed in the 2D char array
     * 
     * @param image The 2D char array wanting to be vertically mirrored
     * @return The newly flipped 2D char array
     */
    private static char[][] verticalMirror(char[][] image) {
        // Creates the new 2D char array with the same sizing as the passed in one
        char[][] newImage = new char[image.length][image[0].length];

        // Loops through the 2D array and passes in the vertically mirrored values to the new 2D char array
        for(int row = 0; row < image.length; row++) {
            for(int column = 0; column < image[row].length; column++) {
                newImage[row][newImage[row].length - column - 1] = image[row][column];
            }
        }
        return newImage;
    }

    /**
     * The main method which is the entry point of the program
     * @param args Optional arguments you'd like to pass in (Doesn't do anything in this program)
     */
    public static void main(String[] args) {
        // Creates a 2D char array with the image that will be used
        char[][] image = {
            {'#', 'x', '#', '#', '#'},
            {'#', ' ', ' ', ' ', '#'},
            {'#', ' ', 'E', ' ', '#'},
            {'*', ' ', ' ', ' ', '|'},
            {'#', ' ', ' ', ' ', '#'},
            {'#', ' ', ' ', ' ', '#'},
            {'#', '#', '#', 'y', '#'},
        };

        // Create a newline
        System.out.println();

        // Displays the original image with a label
        System.out.println("Original Image:");
        displayImage(image);

        // Displays the horizontally mirrored image with a label while also storing as a variable called "horizontallyFlippedImage"
        char[][] horizontallyFlippedImage = horizontalMirror(image);
        System.out.println("Horizontal Flipped Image:");
        displayImage(horizontallyFlippedImage);

        // Displays the vertically mirrored image with a label while also storing as a variable called "verticallyFlippedImage"
        char[][] verticallyFlippedImage = verticalMirror(image);
        System.out.println("Vertically Flipped Image:");
        displayImage(verticallyFlippedImage);

        // Displays the horizontally then vertically mirrored image with a label while also storing as a variable called "horizontallyThenVerticallyFlipped"
        char[][] horizontallyThenVerticallyFlipped = verticalMirror(horizontallyFlippedImage);
        System.out.println("Horizontally and then Vertically Flipped Image:");
        displayImage(horizontallyThenVerticallyFlipped);
    }
}
