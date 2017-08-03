import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class HelloWorld{
  JFrame frame;

  HelloWorld(){
    frame = new JFrame("Hello World!");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300,300);
    frame.setVisible(true);
  }

  public static void main(String[] args){
    SwingUtilities.invokeLater(new Runnable(){
      public void run(){
        new HelloWorld();
      }
    });
  }
}
