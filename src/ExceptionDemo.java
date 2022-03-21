import java.io.File;

public class ExceptionDemo {
    public static void main(String[] args) {

         try{
             System.out.println(9/3); // catch block not executed as there is no exception
             System.out.println(2/0);
             System.out.println("hi");
             //it will only execute what is under exception. Exception ball only, doesnt go back. forward flow only
             // can be user input too
// suseptible code
    }
         catch (Exception e){

           // can add multiple catch blocks
//             e.printStackTrace();
//             System.out.println(e.getMessage());
         }
         // Exception will be a Parent class and will catch all kinds of Exceptions
         // after try n catch to execute critical portion of code
        finally {
             {
         }
         String name = "ena";
         // will give exception with name = null
        System.out.println(name.toUpperCase());
        System.out.println( "hi");
}

}}
