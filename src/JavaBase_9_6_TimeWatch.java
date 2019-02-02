import java.util.Scanner;

public class JavaBase_9_6_TimeWatch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StopWatch T1 = new StopWatch();
       // T1.start();
        if (input.nextInt() == 1){
            T1.stop();
        }
        System.out.println(T1.getElapsedTime());
    }
}
//秒表
class StopWatch{
     private long startTime;
     private long endTime;
     StopWatch(){
         this.startTime = System.currentTimeMillis();
     }
     void start(){
         this.startTime = System.currentTimeMillis();
     }
     void stop(){
         this.endTime = System.currentTimeMillis();
     }
     long getElapsedTime(){
         return this.endTime - this.startTime;
     }

}