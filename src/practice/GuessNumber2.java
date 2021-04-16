package practice;
import java.util.Scanner;
import java.util.Random;
public class GuessNumber2 {
    public static void main (String args[]) {
        System.out.println("我来猜你心里想的1-100的数:");
        Random readom=new Random();
        Scanner reader=new Scanner(System.in);
        int programGuess=0,result=-1,lastGuess=0,max=100,min=0;
        programGuess=readom.nextInt(100)+1;
        lastGuess=programGuess;
        System.out.print("你心里的数字是"+programGuess+"吗?");
        result=reader.nextInt();
        while(result!=2) {
            if (result==1) {
                if(lastGuess<max){max=lastGuess;}
                programGuess= readom.nextInt(max-min-1)+min+1;//猜大了
                lastGuess=programGuess;
                System.out.print("你心里的数字是"+programGuess+"吗?");
                result=reader.nextInt();
            }
            else if (result==0) {
                if(lastGuess>min){min=lastGuess;}
                programGuess = readom.nextInt(max-min-1)+min+1;//猜小了
                lastGuess=programGuess;
                System.out.print("你心里的数字是" + programGuess + "吗?");
                result=reader.nextInt();
            }
        }
        System.out.println("Yes,我猜对了！");
    }
}




