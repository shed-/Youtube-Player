package main.shed.player.ui;


import javax.swing.*;

/**
 * Download.java
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


public class Download extends JFrame {

    public Download(){

        /** The Title of the frame **/
        super("Download");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(400,300);

        setVisible(true);

        /** Setting the location of the frame to the center of the screen **/
        setLocationRelativeTo(null);


    }


    public static void load(){
        new Download();
    }

}
