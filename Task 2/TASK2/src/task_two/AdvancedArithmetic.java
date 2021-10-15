
package task_two;

import java.math.BigInteger;


 interface AdvancedArithmetic {
  public static void divisorSum(int n){
      int j=0;
      for(int i=1;i<=n;i++)
      {
          if(n%i==0){
              System.out.print(i+ ",");
              j=j+i;
          }
      }
      System.out.println();
     System.out.println("The sum all divisor:"+j);
     
      
      
    
  }

    
   public static int findFactorial(int n){
     BigInteger result= BigInteger.ONE;
     if(n<0)
         System.out.println("Cant found neg number");
     else if(n<=1)
         System.out.printf("%d!=%d",n,result);
     else
     {
     for(int i=n;i>=2;--i)
     {
         result=result.multiply(BigInteger.valueOf(i));
         
     }}
     System.out.println("The factorial of "+n+"!="+result);
      return 0;
       
   }
    
}
