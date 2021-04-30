package book;

abstract class Cycle {
    public abstract void ride();
    public abstract void wheel();
}

class Unicycle extends Cycle{
    @Override
    public void ride() {
        Cycle cycle;
        cycle = new Unicycle();
    }

    @Override
    public void wheel() {
        System.out.println("Unicycle有1个轮子");
    }
}

class Bycycle extends Cycle{
    @Override
    public void ride() {
        Cycle cycle;
        cycle = new Bycycle();
    }

    @Override
    public void wheel() {
        System.out.println("Bycycle有2个轮子");
    }
}

class Trycycle extends Cycle{
    @Override
    public void ride() {
        Cycle cycle;
        cycle = new Trycycle();
    }

    @Override
    public void wheel() {
        System.out.println("Trycycle有3个轮子");
    }
}

class People{
    String name;
    int age;
    @Override
    public String toString() {
        return name + age;
    }
}

public class Example_Cycle{
    public static void main(String args[]){
        Cycle cycle;
        Unicycle a = new Unicycle();
        Bycycle b = new Bycycle();
        Trycycle c = new Trycycle();
        a.ride();
        b.ride();
        c.ride();
        if(a instanceof Cycle) {
            System.out.println("a是Unicycle类的对象");
        }
        else {
            System.out.println("a不是Unicycle类的对象");
        }
        if(b instanceof Cycle) {
            System.out.println("b是Bycycle类的对象");
        }
        else {
            System.out.println("b不是Bycycle类的对象");
        }
        if(c instanceof Cycle) {
            System.out.println("c是Trycycle类的对象");
        }
        else {
            System.out.println("c不是Trycycle类的对象");
        }
        a.wheel();
        b.wheel();
        c.wheel();
        People p = new People();
        p.name="李华";
        p.age=18;
        System.out.println(p);
    }
}