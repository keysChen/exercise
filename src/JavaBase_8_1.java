//求矩阵中特定列中所有数组的和

import java.util.Scanner;


public class JavaBase_8_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[][] IAmMatrix = new double[3][4];
        for (int i = 0; i<3; i++){
            System.out.printf("请输入第 %d 行的4个数字:",i);
            for (int j = 0; j<4; j++){
                IAmMatrix[i][j] = input.nextDouble();
            }
        }
        System.out.println("请输入想要求和的那一列");
        int num;
        num = input.nextInt();
        System.out.println(Sum(IAmMatrix,num));
    }
    public static double Sum(double[][] M,int j){
        double sum=0;
        for(int i = 0; i<3;i++){
            sum += M[i][j-1];
        }
        return sum;
    }

}
