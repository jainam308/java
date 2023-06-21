import java.util.Scanner;
 class prac4 {
 public static void main(String[] args) {
    System.out.println("-------------------------");
    System.out.println("Vora Jainam(216090307030)");
    System.out.println("-------------------------");
     //matrix-1
    int[][] matrix=new int[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
           
            System.out.println("Enter the value of matrix["+i+"]["+j+"]");
            matrix[i][j]=new Scanner(System.in).nextInt();
        }
    }
      //matrix-2
        int[][] matrix2=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
              System.out.println("Enter the value of matrix["+i+"]["+j+"]");
              matrix2[i][j]=new Scanner(System.in).nextInt();
              
            }
    }
    //addition of matrix
    int[][] matrix3=new int[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            matrix3[i][j]=matrix[i][j]+matrix2[i][j];
        }
    }
    //print matrix
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(matrix3[i][j]+" ");
        }
        System.out.println();
    }   
}
 }