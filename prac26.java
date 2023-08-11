class mythread extends Thread {
    mythread(String str) {
        super(str);
    }

    private int GLOBAL_MAXIMUM = 20;
    private int GLOBAL_I;

    synchronized public void odd() {

        for (GLOBAL_I = 1; GLOBAL_I <= GLOBAL_MAXIMUM; GLOBAL_I++) {
            if (GLOBAL_I % 2 != 0) {
                System.out.println("Odd: " + GLOBAL_I);
            }
        }

    }

    synchronized public void even() {

        for (GLOBAL_I = 1; GLOBAL_I <= GLOBAL_MAXIMUM; GLOBAL_I++) {
            if (GLOBAL_I % 2 == 0) {
                System.out.println("Even: " + GLOBAL_I);
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
