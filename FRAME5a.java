import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FRAME5a{
    public FRAME5a(){
        JFrame frame5a=new JFrame("2)پنل کاربری کتاب خوان ");
        frame5a.setVisible(true);
        frame5a.setSize(500, 500);
        JPanel panel=new JPanel();
        frame5a.add(panel);
        panel.setBackground(Color.YELLOW);
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
