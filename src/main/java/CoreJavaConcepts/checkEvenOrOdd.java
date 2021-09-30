package CoreJavaConcepts;

import java.util.Scanner;

public class checkEvenOrOdd {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number- ");
        int a= sc.nextInt();

        if(a%2==0)
        {
            System.out.println("is Even number ");
        }else System.out.println("in Odd number");

    }
}
