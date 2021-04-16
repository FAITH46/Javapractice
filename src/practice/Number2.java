import java.util.Scanner;
public class Number2 {
    public static void main(String args[]) {
        int number = 0, d5, d4, d3, d2, d1,i,Tf;
        Scanner reader = new Scanner(System.in);
        System.out.println("输入一个1至99999之间的数");
        number = reader.nextInt();
        if (number <= 99999 && number >= 1) {
            d5 = number / 10000;
            d4 = number / 1000 % 10;
            d3 = number / 100 % 10;
            d2 = number % 100 / 10;
            d1 = number % 10;
            if (d5!=0) {
                System.out.println(number + "是5位数");
                if (d1 == d5 && d2 == d4) {
                    System.out.println(number + "是回文数");
                }
                else {
                    System.out.println(number + "不是回文数");
                }
            }
            else if (d4!=0) {
                System.out.println(number+"是4位数");
                if(d4==d1 && d3==d2){
                    System.out.println(number+"是回文数");
                }
                else {
                    System.out.println(number+"不是回文数");
                }
            }
            else if (d3!=0) {
                System.out.println(number+"是3位数");
                if(d3==d1){
                    System.out.println(number+"是回文数");
                }
                else {
                    System.out.println(number+"不是回文数");
                }
            }
            else if (d2!=0) {
                System.out.println(number+"是2位数");
                if(d2==d1){
                    System.out.println(number+"是回文数");
                }
                else {
                    System.out.println(number+"不是回文数");
                }
            }
            else if (d1!=0) {
                System.out.println(number+"是1位数");
                System.out.println(number+"是回文数");
            }
        }
        else{
            System.out.printf("\n%d不在1至99999之间",number);
        }
        for(i=1;i<number;i++){
            if (i <= 99999 && i >= 1) {
                d5 = i / 10000;
                d4 = i / 1000 % 10;
                d3 = i / 100 % 10;
                d2 = i % 100 / 10;
                d1 = i % 10;
                if (d5!=0) {
                    if (d1 == d5 && d2 == d4) {
                        System.out.printf(" "+i);
                    }
                }
                else if (d4!=0) {
                    if(d4==d1 && d3==d2){
                        System.out.printf(" "+i);
                    }
                }
                else if (d3!=0) {
                    if(d3==d1){
                        System.out.printf(" "+i);
                    }
                }
                else if (d2!=0) {
                    if(d2==d1){
                        System.out.printf(" "+i);
                    }
                }
                else if (d1!=0) {
                    System.out.printf(" "+i);
                }
            }
        }
    }
}


















