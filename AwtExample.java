import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtExample {
    public static void main(String[] args) {
        // Create a frame (window)
        Frame frame = new Frame("Simple AWT Example");

        // Create a label
        Label label = new Label("Hello, AWT!");

        // Create a button
        Button button = new Button("Click me");

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });

        // Add components to the frame
        frame.add(label);
        frame.add(button);

        // Set layout manager to null for absolute positioning
        frame.setLayout(null);

        // Set bounds for components
        label.setBounds(80, 50, 150, 20);
        button.setBounds(80, 80, 80, 30);

        // Set frame properties
        frame.setSize(300, 200);
        frame.setVisible(true);

        // Handle window close event
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }
}
