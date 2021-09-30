public class Demo {
    public static void main(String[] args) {
        int number = 1221;
        String reverseString = "";
        String strNum = String.valueOf(number);
        int length = strNum.length();
        for (int i = length - 1; i >= 0; i--) {
            reverseString = reverseString + strNum.charAt(i);
//            System.out.println(reverseString);
        }
        if (reverseString.equalsIgnoreCase(strNum)) {
            System.out.println("This is palindrome");
        } else {
            System.out.println("This is not palindrome ");

        }

        String str = "122232221";

        int lengthstr = str.length();
        for (int i = 0; i <= lengthstr; i++)
            for (int j = lengthstr - 1; j >= 0; j--)
                if (str.charAt(i) == str.charAt(j)) {

                }


    }
}
