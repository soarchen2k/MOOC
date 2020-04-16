package ca.monor.week09.W9_17_FirstPackages.mooc.src;

import ca.monor.week09.W9_17_FirstPackages.mooc.logic.ApplicationLogic;
import ca.monor.week09.W9_17_FirstPackages.mooc.ui.UserInterface;
import ca.monor.week09.W9_17_FirstPackages.mooc.ui.TextUserInterface;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
