package practice;

public class Vehicle {
    double speed;
    int power;
    void speedUp(int s){
        speed=speed+s;
        if(speed>200)
        {
            speed=200;
        }
    }
    void speedDown(int d) {
        speed = speed - d;
        if (speed < 0) {
            speed = 0;
        }
    }
    void setPower(int p){
        power=p;
    }
    int getPower(){
        return power;
    }
    double getSpeed(){
        return speed;
    }
    void brake(){
        speed=0;
    }
}

