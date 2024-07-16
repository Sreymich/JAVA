import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    private JTextField firstNumberField, secondNumberField, resultField;
    private JButton addButton, subtractButton, multiplyButton, divideButton, clearButton;

    public Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(5, 2));

        JLabel firstNumberLabel = new JLabel("First Number:");
        firstNumberField = new JTextField(10);
        JLabel secondNumberLabel = new JLabel("Second Number:");
        secondNumberField = new JTextField(10);
        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField(10);
        resultField.setEditable(false);


        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        clearButton = new JButton("Clear");


        add(firstNumberLabel);
        add(firstNumberField);
        add(secondNumberLabel);
        add(secondNumberField);
        add(resultLabel);
        add(resultField);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(clearButton);

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        clearButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double firstNumber = Double.parseDouble(firstNumberField.getText());
        double secondNumber = Double.parseDouble(secondNumberField.getText());
        double result = 0;

        if (e.getSource() == addButton) {
            result = firstNumber + secondNumber;
        } else if (e.getSource() == subtractButton) {
            result = firstNumber - secondNumber;
        } else if (e.getSource() == multiplyButton) {
            result = firstNumber * secondNumber;
        } else if (e.getSource() == divideButton) {
            result = firstNumber / secondNumber;
        }

        resultField.setText(Double.toString(result));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
