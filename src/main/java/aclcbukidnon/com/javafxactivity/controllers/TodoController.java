//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package aclcbukidnon.com.javafxactivity.controllers;

import java.util.Optional;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert.AlertType;

public class TodoController {
    @FXML
    private ListView<String> todoList;
    private final ObservableList<String> todos = FXCollections.observableArrayList();

    public TodoController() {
    }

    @FXML
    public void initialize() {
        this.todos.add("Remove Me");
        this.todoList.setItems(this.todos);
        this.todoList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    @FXML
    protected void onCreateClick() {
        TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle("Create New Todo");
        dialog.setHeaderText("Enter a new todo item:");
        Optional<String> result = dialog.showAndWait();
        result.ifPresent((text) -> {
            if (!text.trim().isEmpty()) {
                this.todos.add(text);
            }

        });
    }

    @FXML
    protected void onDeleteClick() {
        int selectedIndex = this.todoList.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            Alert confirm = new Alert(AlertType.CONFIRMATION);
            confirm.setTitle("Delete Confirmation");
            confirm.setHeaderText("Are you sure you want to delete this todo?");
            confirm.setContentText("This action cannot be undone.");
            Optional<ButtonType> result = confirm.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                this.todos.remove(selectedIndex);
            }
        } else {
            this.showAlert("No Selection", "Please select a todo item to delete.");
        }

    }

    @FXML
    protected void onListEdit() {
        String selectedItem = (String)this.todoList.getSelectionModel().getSelectedItem();
        if (selectedItem != null) {
            TextInputDialog dialog = new TextInputDialog(selectedItem);
            dialog.setTitle("Edit Todo");
            dialog.setHeaderText("Modify your todo item:");
            Optional<String> result = dialog.showAndWait();
            result.ifPresent((newText) -> {
                if (!newText.trim().isEmpty()) {
                    int selectedIndex = this.todoList.getSelectionModel().getSelectedIndex();
                    this.todos.set(selectedIndex, newText);
                }

            });
        } else {
            this.showAlert("No Selection", "Please select a todo item to edit.");
        }

    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText((String)null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
