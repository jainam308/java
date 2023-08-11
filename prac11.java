class Shape{
    final double pie=3.14;
    void area(double r){
        double area= pie*r*r;
        System.out.println("the area of circle is "+area);
    }
    void area(double length,double width){
        double area= length*width;
        System.out.println("the area of rectangle is "+area);
    }
}

class prac11 {
   
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("Parth Shah (216090307037)");
        System.out.println("-------------------------");
        Shape s=new Shape();
        s.area(10);
        s.area(10,10);          
    }
    
}
