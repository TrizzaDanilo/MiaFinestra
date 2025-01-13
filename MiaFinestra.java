import javax.swing.*;
import java.awt.*;

  public class MiaFinestra extends JFramel{
    private JTextField 11;
    private JTextArea 12;
    private JButton 13;
    private JPanel p1;

MiaFinestra(String 11,String 12,String 13){
    Container c= this.getContentPane();
    p1=new JPanel(new FlowLayout(FlowLayout.RIGHT)):
    this.11-new JTextField(l1);
    this.12-new JTextArea(12);
    this.13-new JButton(13);
    setTitle(title:"Finestra BorderLayout");
    setLayout (new BorderLayout());
    c.add(this.l2,BorderLayout.CENTER);
    c.add(this.l1,BorderLayout.NORTH);
    pl.add(this.13);
    c.add(p1,BorderLayout.SOUTH);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

