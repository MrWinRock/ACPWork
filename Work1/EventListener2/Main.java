import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {

   JPanel panel;
   JLabel textLabel;
   JTextField converterField;
   JButton convertButton;
   String text;
   Double fahrenhiet;


   public Main() {
      setTitle("Celcius to Fahrenhiet");
      setSize(500, 200);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      
      textLabel = new JLabel("Celsius to Fahrenhiet (C to F)");
      converterField = new JTextField(10);
      convertButton = new JButton("Convert");
      panel = new JPanel();
      panel.add(textLabel);
      panel.add(converterField);
      panel.add(convertButton);
      convertButton.addActionListener(this);
      text = "";

      add(panel);
      getContentPane().add(panel);
      setVisible(true);
   }

   public void paint(Graphics g) {
      super.paint(g);
      Font f = new Font("Arial", Font.BOLD, 14);
      
      g.setFont(f);
      g.drawString(text, 140, 130);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      String input;
      input = converterField.getText();
      fahrenhiet = (Double.parseDouble(input) * 9 / 5) + 32;
      text = input + " Celsius is " + fahrenhiet + " Fahrenhiet";
      repaint();
   }

   public static void main(String[] args) {
      new Main();
   }
}
