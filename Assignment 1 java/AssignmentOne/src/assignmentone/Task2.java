
package assignmentone;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        
        int negNum=0, posNum=0,i,zero=0, value=0;
        int arr[]=new int[10];
           Scanner scan= new Scanner(System.in);
        
        System.out.println("Enter 10 Numbers: ");
        for(i=0;i<10;i++)
        {
            arr[i]=scan.nextInt();
            
        }
        for(i=0;i<10;i++)
        {
           if(arr[i]<0){
               negNum++;}
           else if(arr[i]==0)
           {
               zero++;
           }
           else
               posNum++;
        }
        value=posNum+zero;
        System.out.println(value + "Positive Numbers");
        System.out.println(negNum + "Negative Numbers");
        
    }
}
