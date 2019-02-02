import java.util.Scanner;

public class JavaBase_9_1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Rectangle a = new Rectangle(4,40);
        Rectangle b = new Rectangle(3.5,35.9);
        a.display();
        b.display();
    }
}
//定义一个类，能返回宽高周长和面积
class Rectangle{
    double width;
    double height;
    Rectangle(){
        this.height = 1;
        this.width = 1;
    }
    Rectangle(double w , double h){
        this.width = w;
        this.height = h;
    }
    double getArea(){
        return this.height*this.width;
    }
    double getPerimeter(){
        return 2*(this.width+this.height);
    }
    void display(){
        System.out.println("height:" + this.height +"\n" + "width:" + this.width);
        System.out.printf("Area: %.2f \nPerimeter: %.2f \n\n",this.getArea(),this.getPerimeter());
    }
}

