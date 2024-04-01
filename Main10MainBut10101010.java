import java.util.Scanner;

public class Main10MainBut10101010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        //-----------------------what i thought to do-------------------------------

        // for (int i = 0; i < num; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         if (j % 2== 0) {
        //             System.out.print("1");
        //         } else {
        //             System.out.print("0");
        //         }
        //     }
        //     System.out.println();
        // }



        //---------------------what actualy i have to do-------------------------------

        for(int i=1;i<=num;i++){
            for(int j=0;j<i;j++){
                if((i+j)%2==0){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }


        scanner.close();
    }
}