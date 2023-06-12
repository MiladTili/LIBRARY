import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FRAME4a{
    public FRAME4a(){
        JFrame frame4a=new JFrame("2) پنل کاریری کارمند");
        frame4a.setVisible(true);
        frame4a.setSize(500, 500);
        JPanel panel=new JPanel();
        frame4a.add(panel);
        panel.setBackground(Color.YELLOW);
        JButton add=new JButton ("اضافه کردن کتاب");
        panel.add(add);
        JTextField remove=new JTextField("حذف کتاب",10);
        panel.add(remove);
        remove.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                remove.setText("");
            } 

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        JTextField trust=new JTextField("امانت گرفتن",10);
        panel.add(trust);
        trust.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                trust.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        JTextField delivery=new JTextField("تحویل کتاب",10);
        panel.add(delivery);
        delivery.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                delivery.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        JTextField code=new JTextField("ساعت کاری در روز",10);
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
        JTextField seven=new JTextField("هفت روز (شابک)",30);
        panel.add(seven);
        seven.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                seven.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        JButton record1=new JButton("ثبت");
        panel.add(record1);
        JButton record2=new JButton("بازگشت");
        panel.add(record2);
        RECORD1 handler1=new RECORD1();
        record1.addActionListener(handler1);
        record2.addActionListener(handler1);
        RECORD3 handler3=new RECORD3();
        add.addActionListener(handler3);
    }
    private class RECORD1 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        new LIBRARY();
    }
}
private class RECORD3 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        new FRAME3();
    }
}
}
