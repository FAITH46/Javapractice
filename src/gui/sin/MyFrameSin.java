package gui.sin;

import gui.MyFrame;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class MyFrameSin extends MyFrame {
    GraphicPanel graphicPanel=new GraphicPanel();
    JSpinner grainField=new JSpinner(new SpinnerNumberModel(10,1,200,1));
    JSpinner rangeField=new JSpinner(new SpinnerNumberModel(60,2,100,5));
    JSpinner freqField=new JSpinner(new SpinnerNumberModel(2,1,200,5));
    JSpinner xoffsetField=new JSpinner(new SpinnerNumberModel(10,10,200,5));
    public MyFrameSin(String title){
        super(title);
        Container root=this.getContentPane();
        root.setLayout(new BorderLayout());
        root.add(graphicPanel);
        graphicPanel.add(new JLabel("粒度"));
        graphicPanel.add(grainField);
        graphicPanel.add(new JLabel("幅度"));
        graphicPanel.add(rangeField);
        graphicPanel.add(new JLabel("频率"));
        graphicPanel.add(freqField);
        graphicPanel.add(new JLabel("位移"));
        graphicPanel.add(xoffsetField);
        ChangeListener listener=new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateUI();
            }
        };
        rangeField.addChangeListener(listener);
        freqField.addChangeListener(listener);
        grainField.addChangeListener(listener);
        xoffsetField.addChangeListener(listener);
    }
    void updateUI(){
        graphicPanel.grain=(Integer) grainField.getValue();
        graphicPanel.range=(Integer) rangeField.getValue();
        graphicPanel.freq=(Integer) freqField.getValue();
        graphicPanel.xoffset=(Integer) xoffsetField.getValue();
        graphicPanel.repaint();
    }
}
