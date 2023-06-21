
class Rectangle
{
    int height,weight;
    Rectangle(int h,int w)
    {
        height =h;
        weight=w;

    }
    void show(){
        int area;
        area=height*weight;
        System.out.println("Area of rectangle is "+area);  
    
}
}
class prac7{
public static void main(String[] args)
    {
        System.out.println("-------------------------");
        System.out.println("Vora Jainam(216090307030)");
        System.out.println("-------------------------");
        Rectangle r1 = new Rectangle(10,20);
        r1.show();
    }
}

