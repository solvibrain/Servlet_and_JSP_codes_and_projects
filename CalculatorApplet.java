import java.applet.Applet;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApplet extends Applet implements ActionListener {
    private TextField display;
    private double num1, num2;
    private String operator;

    public void init() {
        setLayout(new FlowLayout());

        display = new TextField(15);
        add(display);

        Button[] numberButtons = new Button[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new Button(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            add(numberButtons[i]);
        }

        Button addButton = new Button("+");
        Button subtractButton = new Button("-");
        Button multiplyButton = new Button("*");
        Button divideButton = new Button("/");
        Button equalsButton = new Button("=");

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        equalsButton.addActionListener(this);

        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(equalsButton);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (Character.isDigit(command.charAt(0))) {
            display.setText(display.getText() + command);
        } else if ("+-*/".contains(command)) {
            num1 = Double.parseDouble(display.getText());
            operator = command;
            display.setText("");
        } else if (command.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            double result = calculate();
            display.setText(String.valueOf(result));
        }
    }

    private double calculate() {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    return Double.NaN; // Handle division by zero
                }
            default:
                return Double.NaN; // Invalid operator
        }
    }
}
