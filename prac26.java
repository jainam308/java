class mythread extends Thread {
    mythread(String str) {
        super(str);
    }

    private int max = 20;
    private int i;

    synchronized public void odd() {

        for (i = 1; i <= max; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }

    }

    synchronized public void even() {

        for (i = 1; i <= max; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }

    }

    public void run() {
        try {
            String tname = Thread.currentThread().getName();
            System.out.println("Thread name: " + tname);
            if (tname == "Odd Thread") {
                odd();
            } else {
                even();
            }
            sleep(1000);
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}

public class prac26 {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("Vegad Udit(216090307001)");
        System.out.println("-------------------------");
        mythread t1 = new mythread("Odd Thread");
        mythread t2 = new mythread("Even Thread");
        t1.start();
        t2.start();
        
    }
}
