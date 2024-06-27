/* write a java program using applet and use mousemotionListener 
 when mouse is dragged display what you write in which color you choose..
*/
import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;
public class MM1 extends Applet implements MouseMotionListener,ActionListener
{
  int x1,y1;
  Button b1;
 Color c;
 public void init()
 {
   b1=new Button("Change Color");
   add(b1);
   b1.addActionListener(this);
   addMouseMotionListener(this);
 }
 public void update(Graphics g)
 {
   
   g.setColor(c);
   g.fillOval(x1,y1,25,20);
 }
 public void mouseMoved(MouseEvent me)
 {

 }
 public void mouseDragged(MouseEvent me)
 {
   x1=me.getX();
   y1=me.getY();
   repaint();
    
 }
 public void actionPerformed(ActionEvent ae)
 {
  if(ae.getSource()==b1)
  {
    JColorChooser jc=new JColorChooser();
  c=jc.showDialog(this,"Color",Color.pink);
   
  }
 }
}
/*<applet code="MM1",width="500",height="500">
  </applet>
*/