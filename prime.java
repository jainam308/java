
import java.util.Scanner;
class prime{
    public static void main(String args[])
    {
        boolean flag=true;
        System.out.println("Enter Number :- ");
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                flag=false;
            }
        }
        if(flag==false)
        {
            System.out.println("Not Prime");
        }
        else
        {
            System.out.println("Prime");
        }
        s1.close();
    }
    }