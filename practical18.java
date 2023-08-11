
public class practical18 {
    public static class car {
        public int topspeed;
        public String name;

        public car(int topspeed, String name) {
            this.topspeed = topspeed;
            this.name = name;
        }

        public String toString() {
            return ("Name: " + name + " Topspeed: " + topspeed);
        }
    }

    public static void main(String args[]) {
         System.out.println("-------------------------");
                System.out.println("Shah Harsh(216090307036)");
                System.out.println("-------------------------");
        car c1 = new car(200, "swift");
        car c2 = new car(210, "Innova");
        car c3 = new car(260, "Audi");
        car c4 = new car(180, "Toyota");
        car c5 = new car(200, "Jaguar");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
    }

}
