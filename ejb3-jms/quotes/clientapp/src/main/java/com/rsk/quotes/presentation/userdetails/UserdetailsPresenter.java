package com.rsk.quotes.presentation.userdetails;

import com.rsk.quotes.jndi.JndiServices;
import com.rsk.quotes.messages.UserRegistration;
import com.rsk.quotes.models.CarDetailsMessage;
import com.rsk.quotes.producer.RegisterUser;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.util.converter.IntegerStringConverter;

import javax.inject.Inject;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.UnaryOperator;
import java.util.regex.Pattern;

public class UserdetailsPresenter implements Initializable {
    @FXML
    Label lblUserName;

    @FXML
    Label lblPassword;

    @FXML
    Button register;

    @FXML
    TextField userName;

    @FXML
    PasswordField password;

    @FXML
    TextField timeToLive;

    @Inject
    CarDetailsMessage carDetailsMessage;

    @Inject
    JndiServices quotesJndi;

    @FXML
    RadioButton radioPersistent;

    @FXML
    RadioButton radioNonPersistent;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        TextFormatter<Integer> formatter = new TextFormatter<>(
                new IntegerStringConverter(), // Standard converter form JavaFX
                0,
                new IntegerFilter());

        ToggleGroup persistentGroup = new ToggleGroup();

        radioPersistent.setToggleGroup(persistentGroup);
        radioNonPersistent.setToggleGroup(persistentGroup);

        radioPersistent.setSelected(true);

        lblUserName.setText(resources.getString("UserName"));
        lblPassword.setText(resources.getString("Password"));

        timeToLive.setTextFormatter(formatter);
    }

    public void register(ActionEvent actionEvent) {

        UserRegistration userReg = new UserRegistration();
        userReg.name = userName.getText();
        userReg.password = password.getText();
        userReg.deliveryMode = radioPersistent.isSelected();
        userReg.timeToLive = Integer.valueOf(timeToLive.getText());

        RegisterUser registerUser = null;
        try {
            registerUser = new RegisterUser(quotesJndi, "jms/__defaultConnectionFactory", carDetailsMessage.getQueueName());
            registerUser.sendMessage(quotesJndi.getContext(), userReg);
        } catch (Exception e) {
            e.printStackTrace();
            //todo: bind to UI
            return;
        }
    }

}

