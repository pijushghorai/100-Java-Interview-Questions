import java.util.Scanner;

public class Numberofdigit 
{
    public static void main(String[] args) 
    {
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        while (n != 0) 
        {
            n = n / 10;
            counter++;
        }
        System.out.print("Total Digit of your number = "+counter);
    }
}
