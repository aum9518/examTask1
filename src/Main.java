import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int [] mas = new int[random.nextInt(10,15)];
        System.out.println(mas.length+" is length");
        System.out.println(Arrays.toString(mas(mas)));

    }
    static int [] mas (int num[]){
        for (int i = 0; i< num.length;i++){
            num[i]= i*9;
        }
        return num;
    }
}