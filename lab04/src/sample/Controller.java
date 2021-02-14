package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Controller {
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField PNField;
    @FXML
    private Button enterBtn;

    @FXML
    private DatePicker datePicker;

    private DateTimeFormatter dateTimeFormatter;

    @FXML
    public void initialize () {
        final String datePattern = "M/dd/yyyy";
        dateTimeFormatter = DateTimeFormatter.ofPattern(datePattern);
        datePicker.setConverter(new StringConverter<LocalDate>() {
            @Override
            public String toString(LocalDate date) {
                String finalDate = null;
                if (date != null)
                    finalDate = dateTimeFormatter.format(date);
                return finalDate;
            }

            @Override
            public LocalDate fromString(String string) {
                LocalDate date = null;
                if (string != null)
                    date = LocalDate.parse(string, dateTimeFormatter);
                return null;
            }
        });
    }


    @FXML
    public void btnOnPress (ActionEvent event) {
        if (usernameField.getText().length() > 0) {
            System.out.println(usernameField.getText());
            System.out.println(passwordField.getText());
            System.out.println(nameField.getText());
            System.out.println(emailField.getText());
            System.out.println(PNField.getText());
            System.out.println(datePicker.getEditor().getText());
        }
    }




}
