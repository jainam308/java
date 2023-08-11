class Bank {
    float getRoi(){
        return 0;
    }
}
class SBI extends Bank {
    float getRoi(){
        return 7;
    }
}
class ICICI extends Bank {
    float getRoi(){
        return 8;
    }
}
class HDFC extends Bank {
    float getRoi(){
        return 9;
    }
}
public class Practical_17 {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("Shah Harsh(216090307036)");
        System.out.println("-------------------------");
        Bank ref;
        ref = new SBI();
        System.out.println("SBI ROI IS " + ref.getRoi());
        ref = new ICICI();
        System.out.println("ICICI ROI IS " + ref.getRoi());
        ref = new HDFC();
        System.out.println("HDFC ROI IS " + ref.getRoi());

    }
}
