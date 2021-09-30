package CoreJavaConcepts;

public class swaptwoNumber {
    public static void main(String[] args)
    {
        //-------------using 2 variable--------------
       /* int a =20;
        int b =30;
        System.out.println("Before swap a= "+a+" b= "+b);

       b=b+a;
       a=b-a;
       b=b-a;
        System.out.println("Total = "+a);
       System.out.println("After swap a= "+a+" b= "+b);*/

       //---------------------Using three variable----------
        int x = 10;
        int y=20;

        System.out.println("Before swap x = "+x+" y ="+y);
        int z=x;
        x=y;
        y=z;
        System.out.println("After swap x = "+x+" y ="+y);



    }
}
