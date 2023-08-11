class Student {
    private Long eno;
    private String name;
    private static int total_no_student = 0;

    Student(Long eno, String name) {
        this.eno = eno;
        this.name = name;
        total_no_student++;
    }

    void display() {
        System.out.println("Student Enorellment Number : " + eno);
        System.out.println("Student Name : " + name);
        System.out.println("Total No. enrolled of Students : " + total_no_student);
    }
}

public class prac9 {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("SHAH HARSH (216090307036)");
        System.out.println("-------------------------");
     Student s1 = new Student(216090307036L, "Shah Harsh");
     Student s2 = new Student(216090307028L, "Yug Doshi");
     Student s3 = new Student(216090307037L, "Parth Shah");
     s1.display();
     s2.display();
     s3.display();
        

 }   
}
