package com.mycompany.mars_rover_simple_solution;

class Vehicles {
    Location location;

    public Vehicles(Location location) {
        this.location = location;
    }

    public Vehicles(long x, long y, Heading heading) {
        this.location = new Location(x, y, heading);
    }

    private void Backwards() {
        switch (this.location.coordinates.heading) {
            case North:
                this.location.coordinates.y--;
                break;
            case South:
                this.location.coordinates.y++; 
                break;
            case East:
                this.location.coordinates.x--;
                break;
            case West:
                this.location.coordinates.x++; 
                break;  
        }
    }

    // private void BackwardsWest() {
    //     this.location.coordinates.x--;
    // }

    private void Forward() {
        switch (this.location.coordinates.heading) {
            case North:
                this.location.coordinates.y++;
                break;
            case South:
                this.location.coordinates.y--;
                break;
            case East:
                this.location.coordinates.x++;
                break;
            case West:
                this.location.coordinates.x--;
                break;
        }
    }

    private void Left() {
        switch (this.location.coordinates.heading) {
            case North:
                this.location.coordinates.heading = Heading.West;
                break;
            case South:
                this.location.coordinates.heading = Heading.East;
                break;
            case East:
                this.location.coordinates.heading = Heading.North;
                break;
            case West:
                this.location.coordinates.heading = Heading.South;
                break;
        }
    }

    private void Right() {
        switch (this.location.coordinates.heading) {
            case North:
                this.location.coordinates.heading = Heading.East;
                break;
            case South:
                this.location.coordinates.heading = Heading.West;
                break;
            case East:
                this.location.coordinates.heading = Heading.South;
                break;
            case West:
                this.location.coordinates.heading = Heading.North;
                break;
        }
    }

    private void DoC(char command) {
        switch (command) {
            case 'F':
                Forward();
                break;
            case 'B':
                Backwards();
                break;
            case 'L':
                Left();
                break;
            case 'R':
                Right();
                break;
            default:
                System.out.println("This command not defined  " + command);
                break;
        }
    }

    public void command(String command) {
        for (int i = 0; i < command.length(); i++) {
//            this.location.print();
            DoC(Character.toUpperCase(command.charAt(i)));

            
                
        }
    }

    public void print() {
        this.location.print();
    }
}
