import java.util.Scanner;

public class Main8mirrorImageOfMain {
    public static void main(String[] args) {
        Scanner sa = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sa.nextInt();
        for(int i = 1 ; i<=num; i++){
            for(int j=0;j<num-i;j++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sa.close();
    }
}
