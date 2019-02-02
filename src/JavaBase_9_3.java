import java.util.Random;

public class JavaBase_9_3 {
    public static void main(String[] args){
        //9.3
        java.util.Date date = new java.util.Date();
        for (int i = 0,j = 10000; i < 12 ; i++ , j*=10){
            date.setTime(j);
            System.out.println(date.toString());
        }

        //9.4
        Random random = new Random(1000);
        for (int i =0; i<51 ; i++){
            System.out.println(random.nextInt(100));
        }
    }
}
