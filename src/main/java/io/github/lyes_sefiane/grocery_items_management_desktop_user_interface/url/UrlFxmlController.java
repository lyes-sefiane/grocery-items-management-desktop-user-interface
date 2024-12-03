package io.github.lyes_sefiane.grocery_items_management_desktop_user_interface.url;

import javafx.application.HostServices;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.web.WebView;
import org.springframework.context.ApplicationContext;

/**
 * @author Lyes Sefiane
 * @email:  lyes.sefiane@gmail.com
 * @version 1.0
 * @since 2024-10-10
 */
public abstract class UrlFxmlController {

    @FXML
    protected Hyperlink hyperlink;

    @FXML
    protected WebView webView;

    protected abstract String getUrl();

    protected ApplicationContext applicationContext;

    protected UrlFxmlController(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @FXML
    protected void initialize() {
        hyperlink.setText(this.getUrl());
        Platform.runLater(() -> webView.getEngine().load(this.getUrl()));
    }

    @FXML
    protected void onClickAction(ActionEvent ignoredEvent) {
        applicationContext.getBean(HostServices.class).showDocument(this.getUrl());
    }
}
