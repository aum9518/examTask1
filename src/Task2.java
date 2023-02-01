import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int b = 0;
        int [] mas2 = new int[10];
        for (int i = 0; i < mas2.length; i++) {
            mas2[i]= rnd.nextInt(2,15);
        }

        System.out.println(Arrays.toString(mas(mas2)));
    }
    static int[] mas(int mas1[]){

        int b = mas1[0];
        //Arrays.sort(mas1);
       for (int i =0;i< mas1.length;i++){

           b=Math.min(b,mas1[i]);

       }
        System.out.println("Min sum of array: "+b);
        return mas1;
    }
}
