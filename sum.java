import java.util.Scanner;
class sum{
    public static void main(String args[])
    {
        System.out.println("Enter Number :- ");
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
         int sum=0;
          while(n!=0)
        {
              int digit =n%10;//n=1234%10=4
             sum=sum+digit;//4+0=4
             n=n/10;//1234/10=123
             //same process will repeat
        }
          System.out.println("Sum of Given Number is "+sum); 
          s1.close();
    }
    }