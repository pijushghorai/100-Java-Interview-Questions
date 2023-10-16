import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr Three number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a > b)
        {
            if(a > c)
            {
                System.out.print("Gratest = "+a);
            }
            else
            {
                System.out.println("Gratest = "+c);
            }
        }
        else
        {
            if(b > c)
            {
                System.out.println("Greater = "+b);
            }
            else
            {
                System.out.println("Greater = "+c);
            }
        }
    }
}
