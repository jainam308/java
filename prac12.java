public class prac12 {
        public static class Shape {
             int r;
    
             Shape() {
                this(5);
            }
    
             Shape(int radius) {
                this.r = radius;
            }
    
             void display() {
                float area = (float) 3.14 * r * r;
                System.out.println("The area of the circle is: " + area);
            }
        }
        public static void main(String args[]) {
            
                System.out.println("-------------------------");
                System.out.println("Vora Jainam(216090307030)");
                System.out.println("-------------------------");
            Shape circle = new Shape();
            Shape circle2 = new Shape(4);
            circle.display();
            circle2.display();
        }
    }