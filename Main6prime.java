import java.util.Scanner;

public class Main6prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Print prime num from 1 to ");
        int p = sc.nextInt();
        for(int i=1; i<=p; i++){
            int flag=0;
            for(int j=2; j<i;j++){
                if(i%j==0){
                    flag=1;
                }
            }
            if(flag==0){
                System.out.println(i);
            }
        }





        //-------------------infinite loop of hello-------------------------------

        // for(;;){
        //     System.out.println("hello");
        // }

        sc.close();
    }
}
