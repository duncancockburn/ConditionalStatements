package Conditionals;

//a boolean statement is a condition which returns either true or false.

public class BooleanStatement {

    public static int a;
    public static int b;
    public static int c;

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 2;

        System.out.println(BooleanStatement.method1(a, b, c));

    }




    public static boolean method1 (int a, int b, int c){
        boolean result;
        if (a == (b/c)) {
            result = true;
        }else{
            result = false;
        }return result;
    }
}
