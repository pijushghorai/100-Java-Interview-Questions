// LCM stands for "Least Common Multiple." It is a mathematical concept used to find the smallest multiple that is evenly divisible by two or more numbers. In other words, the LCM is the smallest number that all the given numbers can divide into without leaving a remainder.
// To find the LCM of two or more numbers, you can use various methods, such as prime factorization, listing multiples, or using the "cake method." The LCM is commonly used in mathematics to solve problems involving fractions, ratios, and proportions.
// If you have specific numbers you'd like to find the LCM for or if you need more detailed information, please provide additional context or numbers, and I'd be happy to assist further.

import java.util.Scanner;
public class Lcm {
    public static void main(String[] args) 
    {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :  ");
        num1 = sc.nextInt();
        System.out.print("Enter Second number :  ");
        num2 = sc.nextInt();

        int lcm = (num1 > num2) ? num1 : num2;

        while(true)
        {
            if(lcm % num1 == 0 && lcm % num2 == 0)
            {
                System.out.print("LCM of two number : "+lcm);
                break;
            }
            ++lcm;
        }
    }
}
