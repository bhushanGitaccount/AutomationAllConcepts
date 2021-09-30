package CoreJavaConcepts;

public class stringPalindrome {
public static void main(String[] args)
{
    String str = "12321";
    String x = "";
    int length = str.length();
    System.out.println("LENGTH OF STRING IS = "+length);
    for (int k = length-1;k>=0;k--)
    {
        x = x + str.charAt(k);
        System.out.println(x);
    }
    if (x.equalsIgnoreCase(str))
    {
        System.out.println("is palindrome");
    }
    else
    {
        System.out.println("not palindrome");
    }
}
}
