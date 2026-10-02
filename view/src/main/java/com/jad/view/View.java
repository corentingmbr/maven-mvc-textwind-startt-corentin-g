package com.jad.view;

import java.awt.Color;

import com.jad.controller.IController;
import com.jad.model.IModel;
import com.jad.textwindow.*;

public class View implements IView {
    private final IModel model;
    private IController controller;
    private TextWindow textWindow;

    public View(final IModel model) {
        this.model = model;
        TextWindowSettings textWindowSettings = new TextWindowSettings();
        textWindowSettings.setScreenWidth(80);
        textWindowSettings.setScreenHeight(40);
        textWindowSettings.setTitle("Tron by CAB");
        textWindowSettings.setFontSize(12F);
        textWindowSettings.setBackgroundColor(Color.red);
        this.textWindow = new TextWindow(textWindowSettings);
        this.textWindow.setVisible(true);
    }

    @Override
    public void setController(final IController controller) {
        this.controller = controller;
    }

    @Override 
    public void displayMessage(final String message) {
        this.textWindow.display(message);
    }
}
