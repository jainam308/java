import java.util.Scanner;

class prac10 {

    public static void main(String[] args){
        System.out.println("-------------------------");
        System.out.println("Parth Shah (216090307037)");
        System.out.println("-------------------------");
        double area_circle;
        final double pie=3.14;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of radius");
        double r=sc.nextDouble();
        area_circle=pie*r*r;
        System.out.println("The area of circle is "+area_circle);
       sc.close();
    }
}
