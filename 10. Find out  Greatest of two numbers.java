import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr First number : ");
        int a = sc.nextInt();
        System.out.print("Enetr Second number : ");
        int b = sc.nextInt();
        if(a > b)
        {
            System.out.println("Greater = "+a);
        }
        else
        {
            System.out.println("Greater = "+b);
        }
    }
}
