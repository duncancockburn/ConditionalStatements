package Java_fundementals.ExceptionHandling;

import java.util.Scanner;

public class pass_in {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = scanner.nextInt();
        System.out.println("Enter another number");
        int b = scanner.nextInt();

        Exception_Handling object = new Exception_Handling(a, b);
        System.out.println(object.result2(a, b));



        System.out.println("enter a index number between 0 and 4");
        int index_input = scanner.nextInt();


        Exception_Handling object2 = new Exception_Handling(index_input);
        System.out.println(object2.result());

    }
}
