package main.shed.player;

import javax.swing.*;
import main.shed.player.ui.Download;

/**
 * Player.java
 *
 *
 * @author shed-
 *
 *
 * @version 0.0.1
 *
 *
 * @since August 13, 2014
 *
 */

public class Player {

    public static void main(String[] args) {

        try {

            /** Setting the look and feel of the Youtube Player **/
            UIManager.setLookAndFeel("de.javasoft.plaf.synthetica.SyntheticaAluOxideLookAndFeel");

            Download.load();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}