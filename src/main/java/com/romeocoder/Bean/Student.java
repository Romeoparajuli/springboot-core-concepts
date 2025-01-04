package com.romeocoder.Bean;

/**
 * The Student class represents a student entity with attributes like
 * name, ID, and marks. It provides getter and setter methods to access and
 * modify the student's attributes, as well as a method to display the details.
 */
public class Student {

    // Private fields for encapsulation
    private String nameString; // Stores the student's name
    private int id;            // Stores the student's ID
    private float marks;       // Stores the student's marks

    /**
     * Parameterized constructor to initialize a new Student object with
     * the given name, ID, and marks.
     *
     * @param nameString - The name of the student
     * @param id         - The unique ID of the student
     * @param marks      - The marks obtained by the student
     */
    public Student(String nameString, int id, float marks) {
        this.nameString = nameString;
        this.id = id;
        this.marks = marks;
    }

    // Getter for nameString
    /**
     * Retrieves the name of the student.
     *
     * @return The student's name as a String.
     */
    public String getNameString() {
        return nameString;
    }

    // Getter for id
    /**
     * Retrieves the ID of the student.
     *
     * @return The student's ID as an integer.
     */
    public int getId() {
        return id;
    }

    // Getter for marks
    /**
     * Retrieves the marks of the student.
     *
     * @return The student's marks as a float.
     */
    public float getMarks() {
        return marks;
    }

    // Setter for nameString
    /**
     * Updates the name of the student.
     *
     * @param nameString - The new name to set for the student.
     */
    public void setNameString(String nameString) {
        this.nameString = nameString;
    }

    // Setter for id
    /**
     * Updates the ID of the student.
     *
     * @param id - The new ID to set for the student.
     */
    public void setId(int id) {
        this.id = id;
    }

    // Setter for marks
    /**
     * Updates the marks of the student.
     *
     * @param marks - The new marks to set for the student.
     */
    public void setMarks(float marks) {
        this.marks = marks;
    }

    // Method to display student details
    /**
     * Prints the details of the student (name, ID, and marks) to the console.
     */
    public void displayStudentDetails() {
        System.out.println("Name: " + nameString);
        System.out.println("Id: " + id);
        System.out.println("Marks: " + marks);
    }
}
