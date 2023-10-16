// The acronym "GCD" stands for "Greatest Common Divisor." It is a mathematical concept used to find the largest number that can evenly divide two or more integers without leaving a remainder. In other words, the GCD is the largest positive integer that can divide all the given numbers without any remainder.
// For example, the GCD of 12 and 18 is 6 because 6 is the largest number that can divide both 12 and 18 without leaving a remainder. GCD is a fundamental concept in number theory and has applications in various mathematical and computer science algorithms, such as simplifying fractions and determining the smallest common denominator.

// Formla:
// lcm(a,b)=(| a•b |)/(gcd⁡(a,b))

mathrm {lcm}	=	least common multiple
gcd	=	greatest common divisor
a,b	=	non-zero integers

import java.util.Scanner;
public class Gcd 
{
    public static int gcd(int first_num, int Second_num)
    {
        int i = first_num % Second_num;
        while(i != 0)
        {
            first_num = Second_num;
            Second_num = i;
            i = first_num % Second_num;
        }
        return Second_num;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second number : ");
        int num2 = sc.nextInt();
        System.out.print("GCD of Two numbers : "+gcd(num1, num2));
    }
}
