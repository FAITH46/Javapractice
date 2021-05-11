abstract class Shape {
    double Aera=10;
    abstract double getAera();
}
class Circle extends Shape{
    @Override
    double getAera() {
        System.out.println("圆形的面积为"+this.Aera);
        return this.Aera;
    }
}
class Square extends Shape{
    @Override
    double getAera() {
        System.out.println("正方形的面积为"+this.Aera);
        return this.Aera;
    }
}
class Rectangle extends Shape{
    @Override
    double getAera() {
        System.out.println("长方形的面积为"+this.Aera);
        return this.Aera;
    }
}
class Example {
    public static void main(String args[]){
        Circle a=new Circle();
        Square b=new Square();
        Rectangle c=new Rectangle();
        a.getAera();
        b.getAera();
        c.getAera();
    }
}

