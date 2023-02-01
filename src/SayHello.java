import java.util.Scanner;

public class SayHello {
    static void welcomer(){
        System.out.println("Hi welcom");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int amountOfPeople=in.nextInt();
        for (int i = 0; i < amountOfPeople; i++) {
            welcomer();

        }
    }
}
