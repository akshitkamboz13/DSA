import java.util.Scanner;

public class Main5calculator {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("1. Add\n2. Substraction\n3. Multipication\n4. Divide\n5. Moludle\nChoose operation : ");
        int op = num.nextInt();
        System.out.print("Number 1 : ");
        int num1 = num.nextInt();
        System.out.print("Number 2 : ");
        int num2 = num.nextInt();
        switch (op) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println(num1 / num2);
                break;
            case 5:
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        num.close();
    }
}
