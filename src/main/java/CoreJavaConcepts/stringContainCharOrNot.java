package CoreJavaConcepts;

public class stringContainCharOrNot {
    //If the word contain A print true
    //if the word contain B print false
    //If word contain A and B can not determine
    //If  word doesn't contain A and B print not available
    public static void main(String[] args)
    {
        String str1 = "Bhushan";
        String str = str1.toLowerCase();
        if (str.contains("a" )||str.contains("b")) {
            if (str.contains("a") && str.contains("b")) {
                System.out.println("Can not Determine");
            }else if (str.contains("a")){
                System.out.println("True");

            }else
            {
                System.out.println("False");
            }
        }else{
                System.out.println("Not Available");

        }
    }


}

