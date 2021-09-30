package CoreJavaConcepts;

public class PrintName1000TimeWithoutLooping {
    public static void main(String[] args)
    {
        String name = "Bhushan";
        String dummy = "i";

         dummy = dummy.replaceAll("i","iiiiiiiiii");
         dummy = dummy.replaceAll("i","iiiiiiiiii");
         dummy = dummy.replaceAll("i","iiiiiiiiii");

         dummy = dummy.replaceAll("i",name+"\n");

        System.out.println(dummy);


    }
}
