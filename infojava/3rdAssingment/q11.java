import java.util.Scanner;
class Assignment3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the age =");
        int age=sc.nextInt();
        System.out.print("enter your identity(F-female,M-male)=");
        String ginput = sc.nextLine(); 
        // String input = sc.next(); 
        char gender=ginput.charAt(0);
        System.out.print("your marital status (Y/N) =");
        String input = sc.nextLine(); 
        char marital=input.charAt(0);
        if(gender =='F'||gender=='f'){
            System.out.println("Employee will work only in urban areas....");
        }else if (gender=='M'||gender=='m'){
            if (age>=20 && age<=40){
                System.out.println("Employee may work anywhere.");
             }else if (age<=60 && age>40){
         System.out.println("male empyoee can work urban area..");
             }else{
            System.out.println("invalid detail ");

        }
        }
        else{
            System.out.println("invalid detail ");
        }
    }
}

        