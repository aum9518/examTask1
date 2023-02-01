import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int [] mas = new int[10];
        System.out.println(Arrays.toString(mas(mas)));
    }
    static int[] mas(int mas1[]){
        int b=mas1[0];
        Arrays.sort(mas1);
       for (int i =0;i> mas1.length;i++){
           mas1[i]=(int) (Math.random()*20);
            b+=mas1[i];
       }
        System.out.print(b+" ");
        return mas1;
    }
}
