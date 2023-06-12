import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FRAME5 {
    public FRAME5(){
        JFrame frame5=new JFrame("ورود کتابخوان");
        frame5.setVisible(true);
        frame5.setSize(500, 500);
        JPanel panel=new JPanel();
        frame5.add(panel);
        panel.setBackground(Color.YELLOW);
        JTextField frist=new JTextField("نام کاربری",10);
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
        JTextField code=new JTextField("رمز عبور",10);
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
        JButton record1=new JButton("ثبت");
        panel.add(record1);
        JButton record2=new JButton("بازگشت");
        panel.add(record2);
        RECORD1 handler1=new RECORD1();
        record2.addActionListener(handler1);
        RECORD2 handler2=new RECORD2();
        record1.addActionListener(handler2);
    }
    private class RECORD1 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        new FRAME5a();
    }
    }
    private class RECORD2 implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        new LIBRARY();
    }
}
}
