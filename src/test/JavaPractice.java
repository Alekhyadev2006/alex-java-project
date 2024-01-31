package test;

public class JavaPractice { // class starts here
    static String helloStatement = " hello";
    static String studentName2=  "vamshi Ponnam";
    static int sum;

    public  static void helloStatementPrint(){
        System.out.println("***** Student Name is : "+studentName2);
        System.out.println("***** "+ helloStatement);
    }

    public static void addTwoNumbers(int a, int b) {
        // code implementation
        sum = a+b;
        System.out.println("sum of two numbers :" + sum);
    }


    public static void main(String args[])  //static method method
    {
        helloStatementPrint();

        addTwoNumbers(15,10);

    }


}// class closes here
