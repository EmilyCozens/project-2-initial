package com.csc205.project2;

public class Cylinder extends ThreeDimensionalShape {
    private double height;
    private double radius;

    // Constructor for creating a Cylinder object with a given height and radius
    public Cylinder(double height, double radius) {
        super(); // Call the superclass constructor (if any)
        this.height = height; // Initialize the height attribute
        this.radius = radius; // Initialize the radius attribute
    }

    // Getter method for retrieving the height
    public double getHeight() {
        return height;
    }

    // Setter method for updating the height
    public void setHeight(double height) {
        this.height = height;
    }

    // Getter method for retrieving the radius
    public double getRadius() {
        return radius;
    }

    // Setter method for updating the radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate the surface area of the Cylinder
    @Override
    public double surfaceArea() {
        return 2.0 * Math.PI * radius * (radius + height);
        // Explanation: The formula for the surface area of a cylinder is 2πrh + 2πr².
    }

    // Method to calculate the volume of the Cylinder
    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
        // Explanation: The formula for the volume of a cylinder is πr²h.
    }

    // Method to generate a string representation of the Cylinder
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("height=").append(height); // Include the height in the string
        sb.append(", radius=").append(radius); // Include the radius in the string
        sb.append(", surface area=").append(surfaceArea()); // Calculate and include the surface area
        sb.append(", volume=").append(volume()); // Calculate and include the volume
        sb.append('}');
        return sb.toString();
    }
}
