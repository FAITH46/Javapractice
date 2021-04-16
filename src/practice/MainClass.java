package practice;

public class MainClass {
    public static void main(String args[]){
        TV haierTV = new TV();

        System.out.println("haierTV的频道是"+haierTV.getChannel());
        Family zhangSanFamily = new Family();
        zhangSanFamily.buyTV(haierTV);
        System.out.println("zhangSanFamily开始看电视节目");
        zhangSanFamily.seeTV();
        int m=2;
        System.out.println("zhangSanFamily将电视更换到"+m+"频道");
        zhangSanFamily.remoteControl(m);
        System.out.println("haierTV的频道是"+haierTV.getChannel());
        System.out.println("zhangSanFamily再看电视节目");
        zhangSanFamily.seeTV();
        Family lisiFamily = new Family();//lisi家的电视接上了电视台总台，可以观看可播放频道的电视了！！！
        lisiFamily.buyTV(haierTV);//lisi家获得了haierTV的频道的观看权限，可观看haierTV的频道
        lisiFamily.seeTV();//lisi观看了haierTV频道的电视，执行TV.java里的函数showprogram，播放haierTV的频道
    }
}
