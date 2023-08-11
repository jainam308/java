class prac13 {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("Vora Jainam(216090307030)");
        System.out.println("-------------------------");
    String s1 ="hello my name is jainam vora";
    System.out.println("Length of given string is"+s1.length());
    System.out.println("CharAt of given string is"+s1.charAt(3));
    System.out.println("Contains function of given string answer is"+s1.contains("name"));
    System.out.println("Split function example:");
    String[] words=s1.split(" ");
    for (String w : words) {
        System.out.println(w);
    
    }
    String name="jainam";  
    System.out.println("Format function example:");
    String a=String.format("My name is %32s",name);  
    String b=String.format("value is %f",32.33434);  
    System.out.println(a);
    System.out.println(b);

        }
    }
