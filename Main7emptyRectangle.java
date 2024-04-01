import java.util.Scanner;

public class Main7emptyRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the width: ");
        int num2 = scanner.nextInt();


        //-----------------by me--------------------------
        for (int i = 0; i < num1; i++) {
            if (i == 0 || i == num1 - 1) {
                for (int j = 0; j < num2; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < num2; j++) {
                    if (j == 0 || j == num2 - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }



        


        //--------------------what i learn-------------------------------

        // for (int i = 0; i < num1; i++) {
        //     for (int j = 0; j < num2; j++) {
        //         if (j == 0 || j == num2 - 1 || i == 0 || i == num1 - 1) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        scanner.close();
    }
}
