package Java_fundementals.ExceptionHandling;

//What is the exception hierarchy?#

//the exeption hirearchy refers to the order to which we need to handle exceptions. you should start by using the most
///specific exceptions and then move to the more general ones.
// for example is you were to start with a general exception ie throws exception then this will pick up any exception
// thus making the next exceptions redundent.
// examples of exceptions are out of bounds exceptions/ ioexceptions/ arethmatic exception


//What is the form of a try/catch/finally?#
//try{
//}catch{
//}finally()
//this can be changes so that you have the resource specification within the try parethesis- try with resources.
//often the only reason youu use the finally block is to close the connection for example so if you are to use the
//try with resources you can forget about the finally as it closes automatially


//How do you throw an exception?#
//see what is done below. You throw an exception and either catch it or not depending on how you want the exception
//handled


//How do you create your own custom exception?
//see below- i have created a duncan exception which doesnt let me choose a certain index in the array. An error which
//is only an expection because i want it to be an exception. it would still work


public class Exception_Handling {
    private int a;
    private int b;
    private int input_index;

    Exception_Handling(int a, int b) throws ArithmeticException {
        this.a = a;
        this.b = b;
    }

    public Exception_Handling(int input_index) {
        this.input_index = input_index;
    }

    public int result2(int a, int b){
        int c = a/b;
        System.out.println(c);
        return c;
    }


    public int result() throws duncanException2 {
        int intArray[] = {1, 3, 5, 2, 5};
        Exception_Handling object = new Exception_Handling(input_index);
        int a = object.input_index;
        try {
            if (a == 2) {
                throw new duncanException2("caught");
            }
        } catch (duncanException2 ex) {
            System.out.println("do not choose this one");
        } finally {
            System.out.println("done");
        }
        return intArray[input_index];
    }
}



