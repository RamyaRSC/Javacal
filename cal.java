import java.awt.*;
import java.awt.event.*;

public class cal extends Frame implements ActionListener {
    private TextField textField;
    private Button b1, b2, b3, badd, b4, b5, b6, bsub, b7, b8, b9, bdiv, b0, bdot, bmul, bequal, bclear;

    private double num1, num2, res;
    private String operator;

    public cal() {
        // Initialize the components
        textField = new TextField(30);
        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        badd = new Button("+");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        bsub = new Button("-");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        bdiv = new Button("/");
        b0 = new Button("0");
        bdot = new Button(".");
        bmul = new Button("*");
        bequal = new Button("=");
        bclear = new Button("C");

        // Set the layout manager to GridBagLayout
        setLayout(new GridBagLayout());

        // Create a new GridBagConstraints object to customize the layout
        GridBagConstraints gbc = new GridBagConstraints();

        // Add the TextField
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(textField, gbc);

        // Add the buttons
        // first line
        gbc.gridwidth = 1;
        gbc.gridy = 1;
        add(b1, gbc);

        gbc.gridy = 1;
        gbc.gridx = 1;
        add(b2, gbc);

        gbc.gridy = 1;
        gbc.gridx = 2;
        add(b3, gbc);

        gbc.gridy = 1;
        gbc.gridx = 3;
        add(badd, gbc);

        // second line
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(b4, gbc);

        gbc.gridx = 0;
        gbc.gridx = 1;
        add(b5, gbc);

        gbc.gridx = 0;
        gbc.gridx = 2;
        add(b6, gbc);

        gbc.gridx = 0;
        gbc.gridx = 3;
        add(bsub, gbc);

        // third line
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(b7, gbc);

        gbc.gridy = 3;
        gbc.gridx = 1;
        add(b8, gbc);

        gbc.gridy = 3;
        gbc.gridx = 2;
        add(b9, gbc);

        gbc.gridy = 3;
        gbc.gridx = 3;
        add(bdiv, gbc);

        // fourth line
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(b0, gbc);

        gbc.gridy = 4;
        gbc.gridx = 1;
        add(bdot, gbc);

        gbc.gridy = 4;
        gbc.gridx = 2;
        add(bmul, gbc);

        gbc.gridy = 4;
        gbc.gridx = 3;
        add(bequal, gbc);

        badd.setPreferredSize(new Dimension(65, 40));
        bsub.setPreferredSize(new Dimension(65, 40));
        bmul.setPreferredSize(new Dimension(65, 40));
        bdiv.setPreferredSize(new Dimension(65, 40));
        bequal.setPreferredSize(new Dimension(65, 40));
        bdot.setPreferredSize(new Dimension(65, 40));
        b1.setPreferredSize(new Dimension(65, 40));
        b2.setPreferredSize(new Dimension(65, 40));
        b3.setPreferredSize(new Dimension(65, 40));
        b4.setPreferredSize(new Dimension(65, 40));
        b5.setPreferredSize(new Dimension(65, 40));
        b6.setPreferredSize(new Dimension(65, 40));
        b7.setPreferredSize(new Dimension(65, 40));
        b8.setPreferredSize(new Dimension(65, 40));
        b9.setPreferredSize(new Dimension(65, 40));
        b0.setPreferredSize(new Dimension(65, 40));

        // Add the action listeners to the buttons
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bequal.addActionListener(this);
        bclear.addActionListener(this);

        // Set the window properties
        setTitle("Calculator");
        setSize(500, 500);
        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b0) {
            textField.setText(textField.getText() + "0");
        } else if (e.getSource() == b1) {
            textField.setText(textField.getText() + "1");
        } else if (e.getSource() == b2) {
            textField.setText(textField.getText() + "2");
        } else if (e.getSource() == b3) {
            textField.setText(textField.getText() + "3");
        } else if (e.getSource() == b4) {
            textField.setText(textField.getText() + "4");
        } else if (e.getSource() == b5) {
            textField.setText(textField.getText() + "5");
        } else if (e.getSource() == b6) {
            textField.setText(textField.getText() + "6");
        } else if (e.getSource() == b7) {
            textField.setText(textField.getText() + "7");
        } else if (e.getSource() == b8) {
            textField.setText(textField.getText() + "8");
        } else if (e.getSource() == b9) {
            textField.setText(textField.getText() + "9");
        } else if (e.getSource() == bdot) {
            textField.setText(textField.getText() + ".");
        } else if (e.getSource() == bclear) {
            textField.setText("");
        } else if (e.getSource() == badd) {
            num1 = Double.parseDouble(textField.getText());
            operator = "+";
            textField.setText("");
        } else if (e.getSource() == bsub) {
            num1 = Double.parseDouble(textField.getText());
            operator = "-";
            textField.setText("");
        } else if (e.getSource() == bmul) {
            num1 = Double.parseDouble(textField.getText());
            operator = "*";
            textField.setText("");
        } else if (e.getSource() == bdiv) {
            num1 = Double.parseDouble(textField.getText());
            operator = "/";
            textField.setText("");
        } else if (e.getSource() == bequal) {
            num2 = Double.parseDouble(textField.getText());
            if (operator.equals("+")) {
                res = num1 + num2;
            } else if (operator.equals("-")) {
                res = num1 - num2;
            } else if (operator.equals("*")) {
                res = num1 * num2;
            } else if (operator.equals("/")) {
                res = num1 / num2;
            }
            textField.setText(String.valueOf(res));
        }
    }

    public static void main(String[] args) {
        cal obj = new cal();
        obj.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
