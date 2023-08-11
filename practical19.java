interface Animal{
    void eat();
    
}

 interface Animal2 {
    void run();

    
}
class elephant implements Animal,Animal2{
    public void eat(){
        System.out.println("Elephant eats banana");
    }
    public void run(){
        System.out.println("Elephants run slow");
    }
}
class practical19{
     public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("Shah Harsh(216090307036)");
        System.out.println("-------------------------");
        elephant e=new elephant();
        e.eat();
        e.run();
    } 
    }