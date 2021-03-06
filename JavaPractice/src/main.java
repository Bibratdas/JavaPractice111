

public class main {

    /**
     *  Write programs to use all the data types and given arithmetic operations.
     *  Write program to perform all the arithmetic operations given in the table.
     * @param args
     */
    public static void main(String[] args) {
        int a = 5, b = 10;
        float c = 5.5f, d = 10.9f;
        long e = 1200000l,f=890123l;
        double g=123456.78,h=987654.321;

        performArithmeticOperations(a,b);
        performArithmeticOperations(c,d);
        performArithmeticOperations(e,f);
        performArithmeticOperations(g,h);

    }

    private static void performArithmeticOperations(int a, int b) {
        //Addition
        displayOutput("Addition" , a+b);
        //Subtraction
        displayOutput("Subtraction" ,a-b);
        //Multiplication
        displayOutput("Multiplication" ,a*b);
        //Division
        displayOutput("Division" ,a/b);
        //Unary
        displayOutput("Increment Operator" ,a++);
        //Unary
        displayOutput("Decrement Operator" ,a--);

    }
    private static void performArithmeticOperations(float a, float b) {
        //Addition
        displayOutput("Addition" , a+b);
        //Subtraction
        displayOutput("Subtraction" ,a-b);
        //Multiplication
        displayOutput("Multiplication" ,a*b);
        //Division
        displayOutput("Division" ,a/b);
        //Unary
        displayOutput("Increment Operator" ,a++);
        //Unary
        displayOutput("Decrement Operator" ,a--);

    }
    private static void performArithmeticOperations(double a, double b) {
        //Addition
        displayOutput("Addition" , a+b);
        //Subtraction
        displayOutput("Subtraction" ,a-b);
        //Multiplication
        displayOutput("Multiplication" ,a*b);
        //Division
        displayOutput("Division" ,a/b);
        //Unary
        displayOutput("Increment Operator" ,a++);
        //Unary
        displayOutput("Decrement Operator" ,a--);

    }
    private static void performArithmeticOperations(long a, long b) {
        //Addition
        displayOutput("Addition" , a+b);
        //Subtraction
        displayOutput("Subtraction" ,a-b);
        //Multiplication
        displayOutput("Multiplication" ,a*b);
        //Division
        displayOutput("Division" ,a/b);
        //Unary
        displayOutput("Increment Operator" ,a++);
        //Unary
        displayOutput("Decrement Operator" ,a--);

    }

    private static void displayOutput(String operation,Object i) {
        System.out.println(String.format("Perfoming %s operation and the result is %s",operation,i));
    }
}
