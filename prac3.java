import java.util.Scanner;
class prac3{
    public static void main(String args[])
    {
        System.out.println("-------------------------");
        System.out.println("Vora Jainam(216090307030)");
        System.out.println("-------------------------");
        System.out.println("Enter Number :- ");
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
    //    int s1=1234;
        int rev_num=0;
        while(n!=0)
        {
            int digit = n%10;//1234%10=4 //123%10=3 //2 //1
            rev_num = rev_num *10+digit;//0*10+4=4 //4*10+3=43 //43*10+2=432 //4321
            n=n/10;//1234/10=123 //12 //1
        }
        System.out.println("Reverse Number is"+rev_num);
        s1.close();
    }
    }

