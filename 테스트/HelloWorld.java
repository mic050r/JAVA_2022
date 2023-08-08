import java.applet.*;
import java.awt.*;

public class HelloWorld extends Applet {
   public void paint(Graphics g) {
       g.drawString("Hello, world!", 20, 10);
       g.drawArc(40, 30, 20, 20, 0, 360);
       g.drawRect(100, 100, 300, 300);
       g.drawRect(100, 100, 200, 200);
  }
}