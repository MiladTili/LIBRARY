import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FRAME1 {
    public FRAME1(){
        JFrame frame1=new JFrame("1) ثبت نام");
        JPanel panel=new JPanel();
        frame1.setVisible(true);
        frame1.setSize(500, 500);
        frame1.add(panel);
        panel.setBackground(Color.YELLOW);
        JTextField frist=new JTextField("نام کوچک",10);
        panel.add(frist);
        frist.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                frist.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        JTextField last=new JTextField("نام خانوادگی",10);
        panel.add(last);
        last.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                last.setText("");
            } 

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        JTextField age=new JTextField("تاریخ تولد ",10);
        panel.add(age);
        age.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                age.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        JTextField code=new JTextField("کد ملی",10);
        panel.add(code);
        code.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                code.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        JTextField address=new JTextField("آدرس(محل زندگی)",25);
        panel.add(address);
        address.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                address.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        JButton record1=new JButton("ثبت");
        panel.add(record1);
        JButton record2=new JButton("بازگشت");
        panel.add(record2);
        RECORD handler=new RECORD();
        record1.addActionListener(handler);
        record2.addActionListener(handler);
    }
    private class RECORD implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        new LIBRARY();
    }
}
}