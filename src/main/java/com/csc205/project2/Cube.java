package com.csc205.project2;
public class Cube extends ThreeDimensionalShape { // Define an instance variable to store the width of the cube.

    // Define an instance variable to store the width of the cube.
    private double width;

    // Default constructor initializes width to 0.0.
    public Cube() {
        super(); // Call the constructor of the superclass (ThreeDimensionalShape).
        this.width = 0.0;
    }

    // Parameterized constructor sets the width when a Cube object is created.
    public Cube(double width) {
        super(); // Call the constructor of the superclass (ThreeDimensionalShape).
        this.width = width;
    }

    // Getter method to retrieve the width.
    public double getWidth() {
        return width;
    }

    // Setter method to set the width.
    public void setWidth(double width) {
        this.width = width;
    }
    // Override the surfaceArea() method to calculate the cube's surface area.
    @Override
    public double surfaceArea() {
        return 6.0 * Math.pow(width, 2);
    }

    // Override the volume() method to calculate the cube's volume.
    @Override
    public double volume() {
        return Math.pow(width, 3);
    }

    // Override the toString() method to provide a custom string representation of the Cube.
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
