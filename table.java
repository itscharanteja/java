import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class table extends JFrame implements ActionListener {
private JTable table;
private DefaultTableModel model;
private JTextField tfRow, tfColumn;
private JButton btnAdd, btnDelete;
public table() {
JPanel panel = new JPanel();
panel.setLayout(new FlowLayout());
tfRow = new JTextField(5);
tfColumn = new JTextField(5);
btnAdd = new JButton("Add");
btnDelete = new JButton("Delete");
panel.add(new JLabel("Row:"));
panel.add(tfRow);
panel.add(new JLabel("Column:"));
panel.add(tfColumn);
panel.add(btnAdd);
panel.add(btnDelete);
add(panel, BorderLayout.NORTH);
model = new DefaultTableModel();
table = new JTable(model);
table.setPreferredScrollableViewportSize(new Dimension(500, 70));
table.setFillsViewportHeight(true);
JScrollPane scrollPane = new JScrollPane(table);
add(scrollPane, BorderLayout.CENTER);
btnAdd.addActionListener(this);
btnDelete.addActionListener(this);
setTitle("Table Panel");
setSize(600, 300);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e) {
if (e.getSource() == btnAdd) {
int row = Integer.parseInt(tfRow.getText());
int column = Integer.parseInt(tfColumn.getText());
model.setRowCount(row);
model.setColumnCount(column);
} else if (e.getSource() == btnDelete) {
int row = table.getSelectedRow();
if (row != -1) {
model.removeRow(row);
}
}
}
public static void main(String[] args) {
new table();
}
}