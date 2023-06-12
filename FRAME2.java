import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;


public class FRAME2 {
    public FRAME2(){
        JFrame frame2=new JFrame("2) استخدام");
        frame2.setVisible(true);
        frame2.setSize(500, 500);
        JPanel panel=new JPanel();
        frame2.add(panel);
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
        JTextField fothername=new JTextField("نام پدر",10);
        panel.add(fothername);
        fothername.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                fothername.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        JTextField educational=new JTextField("مدرک تحصیلی",10);
        panel.add(educational);
        educational.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                educational.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        JTextField age=new JTextField("تاریخ تولد",10);
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
        JTextField Insurance=new JTextField("سابقه بیمه",10);
        panel.add(Insurance);
        Insurance.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                Insurance.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        JTextField phone=new JTextField("شماره تلفن همراه",10);
        panel.add(phone);
        phone.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                phone.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        JTextField address=new JTextField("آدرس (محل زندگی)",30);
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

