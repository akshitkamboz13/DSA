import java.util.Scanner;

public class Main9waterImgOfMainBut123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();
        
        int s = 1;

        for(int i = input; i>0; i--){
            for(int j=i;j>0;j--){
                System.out.print(s+"  ");
                s++;
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
