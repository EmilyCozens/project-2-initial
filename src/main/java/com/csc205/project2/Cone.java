package com.csc205.project2;

public class Cone extends ThreeDimensionalShape {
    private double height;
    private double radius;

    // Constructor for creating a Cone object with a given height and radius
    public Cone(double height, double radius) {
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

    // Method to calculate the surface area of the Cone
    @Override
    public double surfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
        // Explanation: The formula for the surface area of a cone is πr(r + √(r² + h²)).
    }

    // Method to calculate the volume of the Cone
    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
        // Explanation: The formula for the volume of a cone is (1/3)πr²h.
    }

    // Method to generate a string representation of the Cone
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cone {");
        sb.append("height=").append(height); // Include the height in the string
        sb.append(", radius=").append(radius); // Include the radius in the string
        sb.append(", surface area=").append(surfaceArea()); // Calculate and include the surface area
        sb.append(", volume=").append(volume()); // Calculate and include the volume
        sb.append('}');
        return sb.toString();
    }
}
