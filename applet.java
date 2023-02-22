import java.applet.Applet;  
import java.awt.Graphics;  
  
public class applet extends Applet{  
  
public void paint(Graphics g){  
String str=getParameter("msg");  
g.drawString(str,50, 50);  
}  
  
}  