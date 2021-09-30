package CoreJavaConcepts;

public class PrimeNumber {
    public static void main(String[] args)
    {
        /*int a = 21;
        int b = a%2;
        if(b==0)
            System.out.println("is prime number");
        else System.out.println("Is not Prime");*/

//------------------Print prime number from 1 to 100-------------------
        for(int i=1;i<100;i++)
        {
            int a = i%2;
            if (a!=0)
            {
                System.out.println("Prime numbers = "+i);

                            }
        }

    }
}
