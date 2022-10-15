package com.mycompany.mars_rover_simple_solution;

import java.util.Scanner;

enum Heading {
    West, East, North, South
}

class Mars_Rover_Simple_Solution {
    public static void main(String[] args) {
    
        Scanner myObj = new Scanner(System.in);
        
    //Input Valuses
        int coor1 = myObj.nextInt();
        int coor2 = myObj.nextInt();
        String dir = myObj.next();
        String command = myObj.next(); 

        Vehicles vehicles = new Vehicles(coor1, coor2, Heading.valueOf(dir));
        vehicles.command(command);

        vehicles.print();
    }
}
