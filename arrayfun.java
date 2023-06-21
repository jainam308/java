import java.util.Scanner;
class arrayfun{
    public static void main(String[] args ){
        System.out.println("Enter size of array");
        Scanner s2=new Scanner(System.in);
        int n=s2.nextInt();
        int arr[]=new int[n];
        while(true)
        {  
            System.out.println("1.create 2.display 3.max 4.min 5.Sum 6.Exit");
            System.out.println("enter your choice");
            Scanner s1=new Scanner(System.in);
            int ch=s1.nextInt();
            if(ch==1){
                for(int i=0;i<n;i++){
                    System.out.println("Enter element of array"+ arr[i]);
                    Scanner s3=new Scanner(System.in);
                    arr[i]=s3.nextInt(); 
                    s3.close();
                }

            }
            if(ch==2){
                for(int i=0;i<n;i++){
                    System.out.println("\n Element of array are"+arr[i]);
                }
            }
            if(ch==3)
            {
                int max=0;
                for(int i=0;i<n;i++)
                {
                    if(arr[i]>max)
                    {
                        max=arr[i];
                    }
                }
                System.out.println(max);
            }

            if(ch==4)
            {
                int min=arr[0];
                for(int i=0;i<n;i++)
                {
                    if(arr[i]<min)
                    {
                        min=arr[i];
                    }
                }
                System.out.println("Minimum element of array are "+min);
            }
        

     
            if(ch==5)
            {
                int sum=0;
                for(int i=0;i<n;i++)
                {
                    sum=sum+arr[i];
                }
                System.out.println(sum);
            }
            if(ch==6){
                break;
            }
            s1.close();;
        }
    
    s2.close();

    }

}
