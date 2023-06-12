import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class LIBRARY {
  public LIBRARY(){
      JFrame library=new JFrame("LIBLERY JAVA");
      library.setVisible(true);
      library.setSize(500, 500);
      JPanel panel=new JPanel();
      library.add(panel);
      panel.setBackground(Color.YELLOW);
      JMenuBar menu1=new JMenuBar();
      JMenu menu2=new JMenu("MENU");
      JMenuItem menua=new JMenuItem("1) ثبت نام");
      JMenuItem menub=new JMenuItem("2) استخدام ");
      JMenuItem menuc=new JMenuItem("3) اهدا وثبت کتاب");
      JMenuItem menud=new JMenuItem("4) ورود کارمند");
      JMenuItem menue=new JMenuItem("5) ورود کتابخوان");
      panel.add(menu1);
      menu1.add(menu2);
      menu2.add(menua);
      menu2.add(menub);
      menu2.add(menuc);
      menu2.add(menud);
      menu2.add(menue);
      JLabel label1=new JLabel("MILAD TILI&&&AMIR HOSSEIN KHOEINIHA", null, 10);
      panel.add(label1);
      JLabel label2=new JLabel("WELCOME TO THE JAVA LANGUAGE LIBLARY",null,10);
      panel.add(label2);
     /*ImageIcon icon = new ImageIcon("D:/Java/project.MENU.png");
      JLabel label3 =new JLabel(icon);
      panel.add(label3);
      setLayout(new BorderLayout());
      panel.add(label3, BorderLayout.SOUTH);*/
       menuhandler1 handler1=new menuhandler1();
       menuhandler2 handler2=new menuhandler2();
       menuhandler3 handler3=new menuhandler3();
       menuhandler4 handler4=new menuhandler4();
       menuhandler5 handler5=new menuhandler5();
       menua.addActionListener(handler1);
       menub.addActionListener(handler2);
       menuc.addActionListener(handler3);
       menud.addActionListener(handler4);
       menue.addActionListener(handler5);
  }
  private class menuhandler1 implements ActionListener{
  @Override
    public void actionPerformed(ActionEvent event) {
        // TODO Auto-generated method stub
        new FRAME1();
    }
  }
  private class menuhandler2 implements ActionListener{
  @Override
    public void actionPerformed(ActionEvent event) {
        // TODO Auto-generated method stub
        new FRAME2();
    }
  }
  private class menuhandler3 implements ActionListener{
  @Override
    public void actionPerformed(ActionEvent event) {
        // TODO Auto-generated method stub
        new FRAME3();
    }
  }
  private class menuhandler4 implements ActionListener{
  @Override
    public void actionPerformed(ActionEvent event) {
        // TODO Auto-generated method stub
        new FRAME4();
    }
  }
  private class menuhandler5 implements ActionListener{
  @Override
    public void actionPerformed(ActionEvent event) {
        // TODO Auto-generated method stub
        new FRAME5();
    }
  }
    public static void main(String[] args) {
        new LIBRARY();
    }
}
