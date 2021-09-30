package CoreJavaConcepts;
public class numberPalindrome {

    public static void main(String[] args) {
        int number = 1214;
        String s = String.valueOf(number);
        String y = "";
        int l = s.length();
        System.out.println("Length of String is = " + l);
        for (int k = l - 1; k >= 0; k--) {
            y = y + s.charAt(k);
            System.out.println(y);
        }
        if (s.equalsIgnoreCase(y)) {
            System.out.println("The string is palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
