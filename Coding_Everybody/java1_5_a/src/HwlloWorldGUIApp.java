//https://www.youtube.com/watch?v=bZuoyW26zW4&list=PLuHgQVnccGMAIluRRVsC1e79ri-dwnBmR&index=11

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class HwlloWorldGUIApp {
    public static void main(String[] args){
        //https://stackoverflow.com/questions/34048468/how-to-change-runnable-to-lambda-expression-in-java-with-intellij-shortcut:w

        javax.swing.SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Helloworld GUI");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setPreferredSize(new Dimension(400, 300));
            JLabel label = new JLabel("Hello World", SwingConstants.CENTER);
            frame.getContentPane().add(label);
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            frame.setLocation(dim.width/2-400/2, dim.height/2-300/2);

            frame.pack();
            frame.setVisible(true);
        });
    }
}
