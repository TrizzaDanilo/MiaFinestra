public class Applicazione{
  public static void main(String[] args){
    String l1 = "North";
    String l2 = "Center";
    String l3 = "Button";

MiaFinestra f1=new MiaFinestra(l1,l2,l3);
f1.setLocation(1280,400);
f1.setSize(400,200);
f1.setVisible(true);
  }

}
