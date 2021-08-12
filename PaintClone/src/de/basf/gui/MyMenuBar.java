package de.basf.gui;

import java.awt.*;

public class MyMenuBar extends MenuBar {

    public MyMenuBar() {
        Menu menu;
        MenuItem menuItem;

        menu = new Menu("Datei");
        menuItem = new MenuItem("beenden");
        menu.add(menuItem);
        menu.addSeparator();
        add(menu);

        menu = new Menu("Formen");
        add(menu);

        menu = new Menu("Farben");
        add(menu);

    }
}
