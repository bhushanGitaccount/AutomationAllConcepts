package CoreJavaConcepts;

public class reverseStringUsingStringBuffer {
    public static void main(String[] args)
    {
        StringBuffer stringA = new StringBuffer("ABA");
        System.out.println("Main String ="+stringA);
        StringBuffer reversestring = stringA.reverse();
        System.out.println("Main String ="+reversestring);
        if (stringA.equals(reversestring))
        {
            System.out.println("Is palindrome");

        }
        else
        {
            System.out.println("It's not palindrome ");
        }
    }
}
