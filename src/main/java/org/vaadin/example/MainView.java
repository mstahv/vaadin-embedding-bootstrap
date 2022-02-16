package org.vaadin.example;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Main;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

/**
 * A sample Vaadin view class.
 */
@Route
public class MainView extends VerticalLayout {

    public MainView() {
        // the Bootsrap layout brings in a decent margin/padding already
        setPadding(false);

        add(new H1("Hello from Vaadin app"));
        TextField textField = new TextField("Your name");
        Button button = new Button("Say hello",
                e -> Notification.show("Hello " + textField.getValue()));
        add(textField, button);
    }

}
