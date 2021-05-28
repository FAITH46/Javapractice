package gui.sin;

import javax.swing.*;
import java.awt.*;

public class GraphicPanel extends JPanel {
    int range=60;
    int grain=10;
    int freq=2;
    int xoffset=10;
    @Override
    protected void paintComponent(Graphics g){
        int height=this.getHeight();
        int width=this.getWidth();
        g.setColor(Color.BLACK);
        g.clearRect(0,0,width,height);

        g.drawLine(0,height/2,width,height/2);
        int center=height/2;
        int x1=0,y1=center,x2=0,y2=0;
        for(int i=0;i<=width;i+=grain){
            x2=i;
            y2=(int)(range*Math.sin(Math.toRadians(x2*freq+xoffset))+center);
            g.drawLine(x1,y1,x2,y2);
            x1=x2;
            y1=y2;
        }
    }
}
