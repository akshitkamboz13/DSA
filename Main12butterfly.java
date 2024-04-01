import java.util.Scanner;

public class Main12butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the butterfly: ");
        int height = scanner.nextInt();//6
        int half = height/2; //3
        if(height%2==0){
        for(int i=0; i<half; i++){//0
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=half-i-1;j>0;j--){//3-0=3      3 2 1
                System.out.print("    ");
            }
            // for(int j=1;j<=half-i-1;j++){//3-0=3    0 1 2 3
            //     System.out.print("  ");
            // }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=half-1; i>=0; i--){//0
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=half-i-1;j>0;j--){//3-0=3      3 2 1
                System.out.print("    ");
            }
            // for(int j=1;j<=half-i-1;j++){//3-0=3    0 1 2 3
            //     System.out.print("  ");
            // }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    else{
        for(int i=0; i<half; i++){//0
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=half-i;j>0;j--){//3-0=3      3 2 1
                System.out.print("    ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<height;i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=half-1; i>=0; i--){//0
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            for (int j = 0; j < half-i; j++) {
                System.out.print("    ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


        scanner.close();
    }
}
