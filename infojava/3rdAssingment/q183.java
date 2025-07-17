import java.util.Scanner;
class Assignment3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
         System.out.print("enter the toal number student get =");
        int studentnum=sc.nextInt();
        double percentage=(studentnum/500.0)*100;
        System.out.println("percentage of student ="+percentage);
    }
}