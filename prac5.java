import java.util.Scanner;
class prac5 {
   public static void main(String[] args) {
    System.out.println("-------------------------");
    System.out.println("Vora Jainam(216090307030 )");
    System.out.println("-------------------------");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number:");
      int n = sc.nextInt();
      int count = 0;
      int number = 2;
      while (count < n) {
          boolean isPrime = true;
          for (int i = 2; i < number; i++) {
              if (number % i == 0) {
                  isPrime = false;
                  break;
              }
          }
          if (isPrime) {
              System.out.println(number);
              count++;
          }
          number++;
      }

        sc.close();
    }
}
