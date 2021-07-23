package questions;

//Java Program to create a
//blank label and add text to it.
import javax.swing.*;
class First extends JFrame {

 // frame
 static JFrame f;

 // label to display text
 static JLabel l;

 // default constructor
 First()
 {
 }

 // main class
 public static void main(String[] args)
 {
     // create a new frame to store text field and button
     f = new JFrame("label");

     // create a label to display text
     l = new JLabel();

     // add text to label
     l.setText("label text");

     // create a panel
     JPanel p = new JPanel();

     // add label to panel
     p.add(l);

     // add panel to frame
     f.add(p);

     // set the size of frame
     f.setSize(300, 300);

     f.show();
 }
}