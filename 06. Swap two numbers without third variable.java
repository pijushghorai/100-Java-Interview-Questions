public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number = ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second number = ");
        int num2 = sc.nextInt();
        System.out.println("Before Swaping : "+num1+" "+num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After Swaping : "+num1+" "+num2);
    }
}
