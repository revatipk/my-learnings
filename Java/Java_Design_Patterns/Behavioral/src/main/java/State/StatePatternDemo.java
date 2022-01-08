package State;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StatePatternDemo {
    Controller controller;
    public static void main(String args[]) {

        String input=null;
        while(true) {
            System.out.println("1. Accounting\n2.Sales\n3.Management\n");
            System.out.println("Enter 1/2/3:");
            BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
            try {
                input = reader.readLine();
            } catch (IOException e) {

            }
            if(null!=input){
                new StatePatternDemo(input);
            }
        }

    }
    StatePatternDemo(String con) {
        controller = new Controller();
        //the following trigger should be made by the user
        if (con.equalsIgnoreCase("3"))
            controller.setManagementConnection();
        if (con.equalsIgnoreCase("2"))
            controller.setSalesConnection();
        if (con.equalsIgnoreCase("1"))
            controller.setAcctConnection();
        controller.open();
        controller.log();
        controller.close();
        controller.update();
    }
}
