package main.shed.player.ui;

import javax.swing.*;
import java.awt.*;

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

        setSize(300,130);

        setVisible(true);

        setResizable(false);

        /** Setting the location of the frame to the center of the screen **/
        setLocationRelativeTo(null);

        getContentPane().setLayout(new BorderLayout());

        getContentPane().add(downloadType(), BorderLayout.PAGE_START);
        getContentPane().add(linkInput(), BorderLayout.CENTER);
        getContentPane().add(listActions(), BorderLayout.PAGE_END);
    }

    public static void load(){
        new Download();
    }

    public JPanel downloadType(){

        JPanel panel
                = new JPanel();

        JRadioButton mp3
                = new JRadioButton("MP3");

        JRadioButton mp4
                = new JRadioButton("MP4");

        ButtonGroup bg
                = new ButtonGroup();

        /** adding them to the button group so only one can be selected **/
        bg.add(mp3);
        bg.add(mp4);

        mp3.setSelected(true);

        panel.add(mp3);
        panel.add(mp4);

        return panel;
    }

    public JPanel linkInput() {
        JPanel panel
                = new JPanel();

        JTextField input
                = new JTextField(25);

        input.setFont(new Font("Arial",Font.PLAIN,10));

        /** text on the input textfield that is destroyed on focus **/
        new GhostText(input,"Please enter your youtube link");

        panel.add(input);

        return panel;
    }

    public JPanel listActions(){
        JPanel panel
                = new JPanel();

        JButton download
                = new JButton("Download");

        JButton skip
                = new JButton("skip this");

        panel.add(download);
        panel.add(skip);

        return panel;
    }

}
