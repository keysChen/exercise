public class JavaBase_9_9 {
    public static void main(String[] args){
    RegularPolygon T1 = new RegularPolygon();
    RegularPolygon T2 = new RegularPolygon(6,4);
    RegularPolygon T3 = new RegularPolygon(10,4,5.6,7.8);
    System.out.printf("Area: %.3f \nPerimeter: %.3f\n",T1.getArea(),T1.getPerimeter());
    System.out.printf("Area: %.3f \nPerimeter: %.3f\n",T2.getArea(),T2.getPerimeter());
    System.out.printf("Area: %.3f \nPerimeter: %.3f\n",T3.getArea(),T3.getPerimeter());
    }
}
//正n边形,能设置边长、边数和坐标位置
//能返回该图形的周长和面积
class RegularPolygon{
    private int n;
    private double side;
    private double x;
    private double y;
    RegularPolygon(){
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }
    RegularPolygon(int n,double s){
        this.n = n;
        this.side = s;
        this.x = 0;
        this.y = 0;
    }
    RegularPolygon(int n,double s,double x,double y){
        this.n = n;
        this.side = s;
        this.x = x;
        this.y = y;

    }

    public double getPerimeter(){
        return this.n*this.side;
    }

    public double getArea(){
        return (this.n*Math.pow(this.side,2))/(4*Math.tan(Math.PI/this.n));
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getN() {
        return n;
    }

}