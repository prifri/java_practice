//https://www.youtube.com/watch?v=-xllzUahaFQ&list=PLuHgQVnccGMAIluRRVsC1e79ri-dwnBmR&index=27
//https://www.youtube.com/watch?v=66S529MuxpY&list=PLuHgQVnccGMAIluRRVsC1e79ri-dwnBmR&index=28

import org.opentutorials.iot.DimmingLights;
import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

import javax.swing.*;

public class OkJavaGoInhomeInput {

    //주석 한글 하이룽
    public static void main(String[] args){

//        String id = JOptionPane.showInputDialog("Enter a id");
//       String bright = JOptionPane.showInputDialog("Eneter a bright level");
        String id = args[0];
        String bright = args[1];


        // Elevator call
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);

        // Security off
        Security mySecurity = new Security(id);
        mySecurity.off();

        // Light on
        Lighting hallLamp = new Lighting(id + " / Hall Lamp");
        hallLamp.on();

        Lighting floorLamp = new Lighting(id + " / floor Lamp");
        floorLamp.on();

        DimmingLights moodLamp = new DimmingLights((id + " moodLamp"));
        moodLamp.setBright(Double.parseDouble(bright));
        moodLamp.on();
    }
}
