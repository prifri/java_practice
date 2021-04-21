//https://www.youtube.com/watch?v=ejPBOti5omY&list=PLuHgQVnccGMAIluRRVsC1e79ri-dwnBmR&index=23
//https://www.youtube.com/watch?v=GHmzWls2irk&list=PLuHgQVnccGMAIluRRVsC1e79ri-dwnBmR&index=24
//https://www.youtube.com/watch?v=x4LXhjzv8q4&list=PLuHgQVnccGMAIluRRVsC1e79ri-dwnBmR&index=25

import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Security;

public class OkJavaGoInhome {
    final static String id = "JAVA APT 507";

    public static void main(String[] args){
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
    }
}
