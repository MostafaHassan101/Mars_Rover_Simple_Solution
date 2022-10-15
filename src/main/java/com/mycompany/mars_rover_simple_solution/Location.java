package com.mycompany.mars_rover_simple_solution;
class Location {
    Coordinates coordinates;

    public Location(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Location(long x, long y, Heading heading) {
        this.coordinates = new Coordinates(x, y, heading);
    }

    public void print() {
        System.out.println(
                "(" + this.coordinates.x + ", " + this.coordinates.y + ")  " + this.coordinates.heading);
    }

}