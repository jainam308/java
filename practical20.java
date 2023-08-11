import java.util.Scanner;

public class practical20 {
    public static abstract class shape {
        public abstract double area();
    }

    public static class circle extends shape {
        public double area() {
            System.out.println("Enter the radius of circle :-");
            Scanner s1=new Scanner(System.in);
            double r=s1.nextDouble();
            double AOC = 3.14 * r * r;
            return AOC;
        }
    }

    public static class triangle extends shape {
        public double area() {
            System.out.println("Enter the height and base of traingle :-");
            Scanner s2=new Scanner(System.in);
            double h=s2.nextDouble();
            Scanner s3=new Scanner(System.in);
            double b=s3.nextDouble();
            // int h = Integer.parseInt(System.console().readLine());
            // int b = Integer.parseInt(System.console().readLine());
            double AOC = 0.5 * h * b;
            return AOC;
        }
    }

    public static class rectangle extends shape {
        public double area() {
            System.out.println("Enter the length and width of rectangle :-");
            
            Scanner s4=new Scanner(System.in);
            double l=s4.nextDouble();
            Scanner s5=new Scanner(System.in);
            double w=s5.nextDouble();
            double AOC = l * w;
            return AOC;
        }
    }

    public static void main(String args[]) {
        System.out.println("-------------------------");
        System.out.println("Vora Jainam(216090307030)");
        System.out.println("-------------------------");
        circle c1 = new circle();
        triangle t1 = new triangle();
        rectangle r1 = new rectangle();

        System.out.println("Area of the circle is: " + c1.area());
        System.out.println("Area of the triangle is: " + t1.area());
        System.out.println("Area of the rectangle is: " + r1.area());
    }
}
