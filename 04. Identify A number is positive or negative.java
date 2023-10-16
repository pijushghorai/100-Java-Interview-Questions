import java.util.Scanner;

public class posetiveornagetive {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number");
        num = sc.nextInt();
        if(num > 0){
            System.out.println("Posetive");
        }
        else{
            System.out.println("Nagetive");
        }
    }
}
