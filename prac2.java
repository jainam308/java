import java.util.Scanner;
class prac2{
     public static void main(String args[])
    {
       System.out.println("-------------------------");
        System.out.println("Vora Jainam(216090307030)");
        System.out.println("-------------------------");
        System.out.println("Enter 1st Number :- ");
        Scanner s1=new Scanner(System.in);
        int a=s1.nextInt();
        System.out.println("Enter 2nd Number :- ");
        Scanner s2=new Scanner(System.in);
        int b=s2.nextInt();
       System.out.println("Enter 3rd  Number :- ");
        Scanner s3=new Scanner(System.in);
        int c=s3.nextInt();
      
      if(a>b && a>c)
      {
        System.out.println("maximum number is "+a);
      }
       else if(b>a && b>c)
      {
        System.out.println("maximum number is"+b);
      }
      else{
          System.out.println("maximum number is"+c);
      }
      s1.close();
      s2.close();
      s3.close();
    }
}
