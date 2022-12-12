import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {

   JButton okBtn, submitBtn, cancelBtn;
   String message;

   public Main() {
      // Create buttons
      okBtn = new JButton("OK");
      submitBtn = new JButton("Submit");
      cancelBtn = new JButton("Cancel");
      message = "";

      setTitle("Event Listener");
      setSize(600, 600);
      setLayout(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);

      // Create JPanel
      JPanel buttonPanel = new JPanel();
      buttonPanel.setBounds(180, 220, 230, 60);
      
      // Add button to JPanel
      buttonPanel.add(okBtn);
      buttonPanel.add(submitBtn);
      buttonPanel.add(cancelBtn);
      
      // Event listener
      okBtn.addActionListener(this);
      submitBtn.addActionListener(this);
      cancelBtn.addActionListener(this);
      
      add(buttonPanel);
      
   }

   // 
   public void paint(Graphics g) {
      super.paint(g);
      Font f = new Font("Arial", Font.BOLD, 18);
      
      g.setFont(f);
      g.drawString("Control in Action: Button", 200, 120);
      g.drawString(message, 210, 400);
   }

   // Event listener for buttons
   @Override
   public void actionPerformed(ActionEvent e) {
      
      if(e.getSource() == okBtn) {
         message = "OK Button Clicked";
         repaint();
      }
      else if(e.getSource() == submitBtn) {
         message = "Submit Button Clicked";
         repaint();
      }
      else if(e.getSource() == cancelBtn) {
         message = "Cancel Button Clicked";
         repaint();
      }
   }

   public static void main(String[] args) {
      
      new Main();
   }
}
