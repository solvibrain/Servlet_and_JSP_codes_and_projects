import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ProductManagement {
    private Frame frame;
    private List productList;
    private TextField productNameInput;

    private ArrayList<String> products;

    public ProductManagement() {
        products = new ArrayList<>();

        frame = new Frame("Product Management System");

        Label label = new Label("Product Name:");
        productNameInput = new TextField();

        Button addButton = new Button("Add Product");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addProduct();
            }
        });

        productList = new List();

        // Set layout manager to FlowLayout
        frame.setLayout(new FlowLayout());

        // Add components to the frame
        frame.add(label);
        frame.add(productNameInput);
        frame.add(addButton);
        frame.add(productList);

        // Set frame properties
        frame.setSize(400, 300);
        frame.setVisible(true);

        // Handle window close event
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    private void addProduct() {
        String productName = productNameInput.getText();
        if (!productName.isEmpty()) {
            products.add(productName);
            updateProductList();
            productNameInput.setText("");
        }
    }

    private void updateProductList() {
        productList.removeAll();
        for (String product : products) {
            productList.add(product);
        }
    }

    public static void main(String[] args) {
        new ProductManagement();
    }
}

