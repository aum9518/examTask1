public class ExamTask3 {
    public static void main(String[] args) {
        number(1.2,3,4.5,6,7,8.6);
    }
    static void number(double...varargs){
        for(double num:varargs){
            if (num==1.2 || num==4.5 || num==8.6){
                System.out.println(num);
            }
        }

    }
}
