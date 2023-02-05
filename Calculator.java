import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

private JTextField display;
private JButton buttons[];
private String labels[] = { "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", ".", "=", "/", "AC" };
private double result = 0.0;
private boolean start = true;
private String operator = "=";

public Calculator() {
display = new JTextField(20);
display.setEditable(false);
JPanel panel = new JPanel();
panel.setLayout(new GridLayout(4, 4));
buttons = new JButton[17];
for (int i = 0; i < 17; i++) {
buttons[i] = new JButton(labels[i]);
panel.add(buttons[i]);
buttons[i].addActionListener(this);
}
add(display, BorderLayout.NORTH);
add(panel, BorderLayout.CENTER);
setTitle("Calculator");
setSize(300, 300);
setVisible(true);
}

public void actionPerformed(ActionEvent e) {
double second = 0.0;
String current = e.getActionCommand();
if (current.equals("0") || current.equals("1") || current.equals("2") || current.equals("3") ||
current.equals("4") || current.equals("5") || current.equals("6") || current.equals("7") ||
current.equals("8") || current.equals("9")) {
if (start) {
display.setText("");
start = false;
}
display.setText(display.getText() + current);
} else if (current.equals("AC")) {
result = 0.0;
display.setText("");
start = true;
} else {
if (start) {
if (current.equals("-")) {
display.setText(current);
start = false;
} else {
operator = current;
}} else {
try {
second = Double.parseDouble(display.getText());
} catch (NumberFormatException ex) {
System.out.println("Error: " + ex);
}
switch (operator) {
case "+":
result += second;
break;
case "-":
result -= second;
break;
case "*":
result *= second;
break;
case "/":
result /= second;
break;
case "=":
result = second;
break;
}
display.setText("" + result);
operator = current;
start = true;
}}
}

public static void main(String args[]) {
new Calculator();
}
}