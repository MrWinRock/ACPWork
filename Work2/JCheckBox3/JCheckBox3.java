import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JCheckBox3 extends JFrame implements ActionListener {
// Prices of the menu items
private static final double PIZZA_PRICE = 10;
private static final double BURGER_PRICE = 5;
private static final double WATER_PRICE = 1;

// Checkboxes for the menu items
private JCheckBox pizzaCheckBox;
private JCheckBox burgerCheckBox;
private JCheckBox waterchecbox;

// Label to display the total cost
private JLabel totalCostLabel;

public JCheckBox3() {
    // Set the title and layout of the window
    setTitle("Food Ordering System");
    setLayout(new GridLayout(4, 1));

    // Create the checkboxes & add checkboxes
    pizzaCheckBox = new JCheckBox("Pizza ($" + PIZZA_PRICE + ")");
    burgerCheckBox = new JCheckBox("Burgers ($" + BURGER_PRICE + ")");
    waterchecbox = new JCheckBox("Water ($" + WATER_PRICE + ")");
    add(pizzaCheckBox);
    add(burgerCheckBox);
    add(waterchecbox);

    // Create a panel
    JPanel totalCostPanel = new JPanel();
    totalCostLabel = new JLabel("Total cost: $0");
    totalCostPanel.add(totalCostLabel);
    add(totalCostPanel);

    // Add action listeners
    pizzaCheckBox.addActionListener(this);
    burgerCheckBox.addActionListener(this);
    waterchecbox.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
    
    double totalCost = 0;
    if (pizzaCheckBox.isSelected()) {
    totalCost += PIZZA_PRICE;
    }
    if (burgerCheckBox.isSelected()) {
    totalCost += BURGER_PRICE;
    }
    if (waterchecbox.isSelected()) {
    totalCost += WATER_PRICE;
    }

    // Update the total cost label
    totalCostLabel.setText("Total cost: $" + totalCost);
}

public static void main(String[] args) {

    JCheckBox3 window = new JCheckBox3();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.pack();
    window.setSize(300, 300);
    window.setVisible(true);
}
}
