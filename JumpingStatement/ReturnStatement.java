package JumpingStatement;

public class ReturnStatement {
     public static  int     calculateSum(int num1,int num2)
     {
        //print a message indicating the method has started
      System.out.println("calculating the sum of " + num1 + " and " + num2);
         int sum = num1 + num2;
       System.out.println(" the sum is : " + sum);
        //return the calculated sum
        return sum;
          }

    public static void main(String[] arge) {
        //call the calculateSum method
        int result = calculateSum(5, 10);
        // print the result
        System.out.println("result : " + result);
    }
}