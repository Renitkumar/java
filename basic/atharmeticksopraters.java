import java.util.Scanner;

public class atharmeticksopraters {
    public static void main(String[] args) {
        Scanner ram=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1= ram.nextInt();
        System.out.print("enter second number: ");
        int num2= ram.nextInt();

        int sum= num1 + num2;
        int sub= num1 - num2;
        int mult= num1 * num2;
        float div= (float) num1 / num2;
        int mod= num1%num2;

        System.out.println("sum= "+sum);
        System.out.println("sub= "+sub);
        System.out.println("mult= "+mult);
        System.out.println("div= "+div);
        System.out.println("mod= "+mod);

    }
}
