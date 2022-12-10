import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {

   JButton btn1, btn2, btn3;
   String topMessage, messageEvent;

   public Main() {

      setTitle("Event Listener");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(null);
      setBounds(0, 0, 600, 600);
      setVisible(true);
      
      JPanel buttonPanel = new JPanel();
      buttonPanel.setBackground(Color.red);
      buttonPanel.setBounds(95, 200, 390, 60);
      add(buttonPanel);

      // Build Buttons
      btn1 = new JButton("OK");
      btn2 = new JButton("Submit");
      btn3 = new JButton("Cancel");

      // Set Buttons' Bounds
      btn1.setBounds(100, 200, 100, 50);
      btn2.setBounds(210, 200, 130, 50);
      btn3.setBounds(350, 200, 130, 50);

      // Add Event Listener
      btn1.addActionListener(this);
      btn2.addActionListener(this);
      btn3.addActionListener(this);

      // Add Buttons to Panel
      buttonPanel.add(btn1);
      buttonPanel.add(btn2);
      buttonPanel.add(btn3);

      // Bottom Label
      messageEvent = "";
      
   }

   // Make Labels
   public void paint(Graphics g) {
      Font f = new Font("Arial", Font.BOLD, 16);
      g.setFont(f);
      g.drawString("Control in Action: Button", 200, 100);
      g.drawString(messageEvent, 220, 400);
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
      if(e.getSource() == btn1) {
         messageEvent = "OK Button Clicked";
         repaint();
      }
      else if(e.getSource() == btn2) {
         messageEvent = "Submit Button Clicked";
         repaint();
      }
      else if(e.getSource() == btn3) {
         messageEvent = "Cancel Button Clicked";
         repaint();
      }
   }
   
   public static void main(String[] args) {
      new Main();
   }
}

