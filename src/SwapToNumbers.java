import java.util.Scanner;

public class SwapToNumbers {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Swapping using third variable
        System.out.println("Enter the value of and b");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.println("b="+b);


        //without using third variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a);
        System.out.println("b="+b);


        //Using XOR
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
}
