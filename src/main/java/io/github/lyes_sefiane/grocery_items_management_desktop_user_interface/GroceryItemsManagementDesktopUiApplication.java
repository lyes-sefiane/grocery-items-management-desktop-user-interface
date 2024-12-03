package io.github.lyes_sefiane.grocery_items_management_desktop_user_interface;

import io.github.lyes_sefiane.grocery_items_management_desktop_user_interface.config.JavafxApplication;
import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GroceryItemsManagementDesktopUiApplication {

	public static void main(String[] args) {
		Application.launch(JavafxApplication.class, args);
	}
}
