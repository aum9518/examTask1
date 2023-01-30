import java.util.Scanner;

public class miniCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        char b = in.next().charAt(0);
        int c = in.nextInt();
        System.out.println(calc(a,b,c));
    }
    static int calc (int a, int b, int c){
        Scanner in = new Scanner(System.in);

        switch (b){
            case '+':
                a=a+c;
                break;
            case '-':
                a=a-c;
                break;
            case '*':
                a=a*c;
                break;
            case '/':
                a=a/c;
                break;
            default:
                System.out.println("Error");
        }
       return a;
    }

}
