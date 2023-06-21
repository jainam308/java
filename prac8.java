class Number
{
    int a,b;
    Number(){
        this(0,0);
    }
    Number(int a,int b)
    {
        this.a=a;
        this.b=b;

    }
    void show(){
        int c;
        c=a+b;
        System.out.println("Addition of number is "+c);  
    }
}
class prac8{
public static void main(String[] args)
    {
        System.out.println("-------------------------");
        System.out.println("Shah Harsh(216090307036)");
        System.out.println("-------------------------");
     Number n1= new Number(100,200);
     n1.show();
     Number n2= new Number();
     n2.show();
    }
}
