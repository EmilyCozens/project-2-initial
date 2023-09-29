package com.csc205.project2;


import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */
public class Project2 {

    public static void main(String[] args) {
        /*
        The following code works with the example design given.
         */
        // Create instances of different shapes
        ThreeDimensionalShape Sphere = new Sphere(2.0);
        ThreeDimensionalShape Cube = new Cube(5.0);
        ThreeDimensionalShape Cylinder = new Cylinder(4.0, 1.0);
        ThreeDimensionalShape Cone = new Cone(3.0, 2.0);

        // Add the shapes to a list for easy processing
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(Sphere);
        shapes.add(Cube);
        shapes.add(Cylinder);
        shapes.add(Cone);

        shapes.forEach(System.out::println);

        /*
        The following code works with the code given.
         */

        /*
        Sphere sphere = new Sphere(2.0);
        System.out.println(sphere);
        */

        for (ThreeDimensionalShape shape : shapes) {
            System.out.println(shape);
        }
    }

}

