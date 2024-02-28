import java.util.Scanner; 

public class LabProgram {
    public static String createAcronym(String userPhrase) {
        String[] seperatedWords = userPhrase.split(" ");
        String acronymString = "";

        for(String word : seperatedWords) {
            if(Character.isUpperCase(word.charAt(0))) {
                acronymString += word.charAt(0) + ".";
            }
        }

        return acronymString;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String input = scnr.nextLine();
        
        System.out.println(createAcronym(input));
    }
}
