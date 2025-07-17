import java.util.Scanner;

class Assignment3{
    // 1. WAP to calculate area of circle 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        double pi=3.1416;

        double area=pi*r*r;
        System.out.println("area of circle"+area);
    }
}
