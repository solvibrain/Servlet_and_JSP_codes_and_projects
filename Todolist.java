// import javafx.application.Application;
// import javafx.collections.FXCollections;
// import javafx.collections.ObservableList;
// import javafx.geometry.Insets;
// import javafx.scene.Scene;
// import javafx.scene.control.*;
// import javafx.scene.layout.BorderPane;
// import javafx.stage.Stage;

// public class Todolist extends Application {

    private ObservableList<String> tasks;
    private ListView<String> todoListView;
    private TextField taskInput;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("To-Do List");

        // Initialize tasks list
        tasks = FXCollections.observableArrayList();

        // Create UI components
        todoListView = new ListView<>(tasks);
        todoListView.setPrefSize(300, 400);

        taskInput = new TextField();
        taskInput.setPromptText("Enter a new task");

        Button addButton = new Button("Add Task");
        addButton.setOnAction(event -> addTask());

        Button removeButton = new Button("Remove Task");
        removeButton.setOnAction(event -> removeTask());

        // Create layout
        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(todoListView);

        // Create a vertical box for input components
        VBox inputBox = new VBox(10, taskInput, addButton, removeButton);
        inputBox.setPadding(new Insets(10));
        borderPane.setCenter(inputBox);

        // Set the scene
        Scene scene = new Scene(borderPane, 400, 400);
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    private void addTask() {
        String newTask = taskInput.getText().trim();
        if (!newTask.isEmpty()) {
            tasks.add(newTask);
            taskInput.clear();
        }
    }

    private void removeTask() {
        int selectedIndex = todoListView.getSelectionModel().getSelectedIndex();
        if (selectedIndex != -1) {
            tasks.remove(selectedIndex);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
