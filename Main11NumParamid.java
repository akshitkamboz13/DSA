import java.util.Scanner;

public class Main11NumParamid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        
        int number = scanner.nextInt();

        for(int i=0;i<number;i++){
            for(int j=0;j<number-i;j++){
                System.out.print("  ");
            }
            for(int j=0;j<=i;j++){
                int p = i-j+1;
                System.out.print(p+" ");
            }
            for(int j=1;j<=i;j++){
                int p = j+1;
                System.out.print(p+" ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
