  //Write a JAVA program to read an integer n and prints the factorial of n, assume that n = 10. 


  public class Factorial
 {
     public static void main(String[] args) 
{

        int num = 10;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}