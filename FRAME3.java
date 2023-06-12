import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FRAME3 {
    public FRAME3(){
        JFrame frame3=new JFrame("3) اهدا و ثبت کتاب");
        frame3.setSize(500 , 500);
        frame3.setVisible(true);
        JPanel panel=new JPanel();
        frame3.add(panel);
        panel.setBackground(Color.YELLOW);
        JTextField bookname=new JTextField("نام گتاب",10);
        panel.add(bookname);
        bookname.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                bookname.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        JTextField writer=new JTextField("نام نویسنده",10);
        panel.add(writer);
        writer.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                writer.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        JTextField publisher=new JTextField("نام ناشر",10);
        panel.add(publisher);
        publisher.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                publisher.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        JTextField Publishers=new JTextField("انتشارات",10);
        panel.add(Publishers);
        Publishers.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                Publishers.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        JTextField credits=new JTextField("تیتراژ",10);
        panel.add(credits);
        credits.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                credits.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        JTextField Published=new JTextField("نوبت چاپ",10);
        panel.add(Published);
        Published.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                Published.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        JTextField Date=new JTextField("تاریخ ثبت کتاب",10);
        panel.add(Date);
        Date.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                Date.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        JTextField Price=new JTextField("قیمت کتاب",10);
        panel.add(Price);
        Price.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                Price.setText("");
            }

            @Override
            public void focusLost(FocusEvent e) {
            }
        });
        JTextField ISBN=new JTextField("شابک",30);
        panel.add(ISBN);
        ISBN.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                ISBN.setText("");
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

