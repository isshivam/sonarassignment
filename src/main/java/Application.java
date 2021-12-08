import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. ADD ");
        System.out.println("2. SUB ");
        System.out.println("3. MUL ");
        System.out.println("4. DIV ");
        int choice = input.nextInt();
        System.out.println("Enter two numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        Calculator calculator = new Calculator();
        if (choice == 1) {
            int sum=calculator.add(a, b);
            System.out.println("sum is:"+sum);

        } else if (choice == 2) {
            int sub=calculator.sub(a, b);
            System.out.println("subtraction is: "+sub);

        } else if (choice == 3) {
            int mul=calculator.mul(a, b);
            System.out.println("multiplication is: "+mul);

        } else if (choice == 4) {
            double div=calculator.div(a, b);
            System.out.println("divison is: "+div);

        } else {
            System.out.println("Wrong Choice");
        }
    }
}



