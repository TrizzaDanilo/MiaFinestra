import javax.swing.*;
import java.awt.*;

  public class MiaFinestra extends JFrame{
    private JTextField l1;
    private JTextArea l2;
    private JButton l3;
    private JPanel p1;

MiaFinestra(String l1,String l2,String l3){
    Container c= this.getContentPane();
    p1=new JPanel(new FlowLayout(FlowLayout.RIGHT));
    this.l1=new JTextField(l1);
    this.l2=new JTextArea(l2);
    this.l3=new JButton(l3);
    setTitle("Finestra BorderLayout");
    setLayout(new BorderLayout());
    c.add(this.l2,BorderLayout.CENTER);
    c.add(this.l1,BorderLayout.NORTH);
    p1.add(this.l3);
    c.add(p1,BorderLayout.SOUTH);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

