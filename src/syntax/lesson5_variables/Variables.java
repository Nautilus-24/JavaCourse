package syntax.lesson5_variables;


public class Variables {

    public static void main(String[] args) {

        //System.out.println(Integer.parseInt("11111111", 2));
        // byte  -128 ... 127
        byte byteNumber = 127;

        System.out.println("The Byte number: " + byteNumber);

        //short -32768 ... 32767
        short shortNumber = 3000;

        System.out.println("The Short number: " + shortNumber);

        // int   -2 147 483 648 ... 2 147 483 647
        int intNumber = 50000000;

        System.out.println("The int number: " + intNumber);

        // long  –9 223 372 036 854 775 808 .... 9 223 372 036 854 775 807
        long longNumber = 999_999_999L;

        System.out.println("The long number: " + longNumber);

        // float  3,4E–38 ... 3,4E+38
        float floatNumber = 3.14F;
        System.out.println("The float number: " + floatNumber);

        // double  4,9e-324 ...  1,7e+308
        double doubleNumber = 334.145678;
        System.out.println("The double number: " + doubleNumber);

        char charSymbol = 'F';
        System.out.println("The char variable: " + charSymbol);

        boolean booleanVariable = true;
        System.out.println("The boolean variable: " + booleanVariable);

        var first = 10;
        int test1, test2, test3;
        test1 = 10;
        test2 = 20;
        test3 = 30;

    }

}
