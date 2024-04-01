import java.util.Scanner;

public class Main3ifelse {
    public static void main(String[] args){
        Scanner ac = new Scanner(System.in);
        int a = ac.nextInt();
        int b = ac.nextInt();
        int c = ac.nextInt();
        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>a && b>c){
            System.out.println(b);
        }
        else if(c>a && c>b){
            System.out.println(c);
        }
        else if(a==b && a==c){
            System.out.println("a=b=c = "+a);
        }
        else if(a>b && a==c){
            System.out.println("a=c ="+a);
        }
        else if(a>c && a==b){
            System.out.println("a=b ="+a);
        }
        else if(b>a && b==c){
            System.out.println("b=c ="+b);
        }
        else if(b>c && b==a){
            System.out.println("b=a ="+b);
        }
        else if(c>a && c==b){
            System.out.println("c=b ="+c);
        }
        else if(c>a && c==b){
            System.out.println("c=a ="+c);
        }
        else{
            System.out.println("Invalid input");
        }
        ac.close();
    }
}
