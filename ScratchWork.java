public class ScratchWork {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        String intAsString = Integer.toString(x);
        boolean isNegative = false;

        if(intAsString.charAt(0) == '-') {
            intAsString = intAsString.substring(1);
            isNegative = true;
        }

        String newString = "";
        for(int i = intAsString.length() - 1; i >= 0; i--) {
            newString += intAsString.charAt(i);
        }

        if(isNegative) {
            newString = "-" + newString;
        }

        long reversed = Long.parseLong(newString);
        if(reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) reversed;
    }
}
