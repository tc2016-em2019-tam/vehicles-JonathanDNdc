package com.jonathanndc;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Vehicle[] myArray = new Vehicle[5];

        myArray[0] = new Jeep("Fred's Jeep");
        myArray[1] = new Jeep("Frank's Jeep");
        myArray[2] = new Hovercraft("Sue's Hover-craft");
        myArray[3] = new Frigate("Money Waster");
        myArray[4] = new PoliceCar("Johnson's PoliceCar");

        LinkedList<Vehicle> myList = new LinkedList<Vehicle>();
        myList.add(new Jeep("Fred's Jeep"));
        myList.add(new Jeep("Frank's Jeep"));
        myList.add(new Hovercraft("Sue's Hover-craft"));
        myList.add(new Frigate("Money Waster"));
        myList.add(new PoliceCar("Johnson's PoliceCar"));


        for (int i = 0; i < myArray.length; i++) {

            System.out.println(myArray[i].getName());

            if (myArray[i] instanceof LandVehicle) {
                LandVehicle lv = (LandVehicle) myArray[i];
                lv.drive();
            }

            if (myArray[i] instanceof Emergency) {
                Emergency ie = (Emergency) myArray[i];
                ie.soundSiren();
            }
        }

        System.out.println("----------------------------");


        for (int i = 0; i < myList.size(); i++) {

            System.out.println(myList.get(i).getName());

            if (myList.get(i) instanceof LandVehicle) {
                LandVehicle lv = (LandVehicle) myList.get(i);
                lv.drive();
            }

            if (myList.get(i) instanceof Emergency) {
                Emergency ie = (Emergency) myList.get(i);
                ie.soundSiren();
            }
        }

    }
}

