package io.github.lyes_sefiane.grocery_items_management_desktop_user_interface.entities;

import com.jfoenix.controls.JFXButton;
import io.github.lyes_sefiane.grocery_items_management_desktop_user_interface.domain.GroceryItemResource;
import io.github.lyes_sefiane.grocery_items_management_desktop_user_interface.entities.enums.IconEnum;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class CustomTableCell extends TableCell<GroceryItemResource, Boolean> {

    private final Button button;

    public CustomTableCell(IconEnum iconEnum) {
        this.button = new JFXButton(StringUtils.EMPTY, new ImageView(new Image(Objects.requireNonNull(getClass().getResourceAsStream(iconEnum.getLocation())),//
                iconEnum.getWidth(),//
                iconEnum.getHeight(),//
                iconEnum.isPreserveRatio(),//
                iconEnum.isSmooth())));
    }

    @Override
    protected void updateItem(Boolean aBoolean, boolean empty) {
        super.updateItem(aBoolean, empty);
        if (!empty) {
            setGraphic(button);
            final TableCell<GroceryItemResource, Boolean> currentTableCell = this;
            currentTableCell.setAlignment(Pos.CENTER);
        } else {
            setGraphic(null);
        }
    }

    public Button getButton() {
        return button;
    }
}
