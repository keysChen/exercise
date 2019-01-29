import java.util.Scanner;

public class CF_transport {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String t_type;
        float temperture;
        while(true){
            System.out.println("请选择输入温度的类型：C（摄氏度），F（华氏度）    如要退出请按Q");
            t_type = input.next();
            if (t_type.equals("Q")) break;
            else {
                System.out.println("请输入温度");
                temperture = input.nextFloat();
                if (t_type.equals("C")) {
                    System.out.println((temperture * 9 / 5 + 32) + " F");
                }
                else if (t_type.equals("F")) {
                    System.out.println((temperture - 32) * 5 / 9 + " C");
                }
            }
        }
    }
}
