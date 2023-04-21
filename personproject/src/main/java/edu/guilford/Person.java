package edu.guilford;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Person 
{
    //Attributes
    private String firstName;
    private String lastName;
    private Double height;
    private Double weight;
    private String eyeColor;
    private String hairColor;
    private Boolean isMale;
    private Boolean isFemale;
    private int points;


    //Construct a person object
    // This is the one helper constructor that copilot gave me
    public Person() {
        firstName = "John";
        lastName = "Doe";
        height = 72.0;
        weight = 180.0;
        eyeColor = "Brown";
        hairColor = "Brown";
        isMale = true;
        isFemale = false;
        points = 1;
    }

    //Empty Person constructor
    public Person(String firstName, String lastName, double height, 
        double weight, String eyeColor, String hairColor, 
        boolean isMale, boolean isFemale, int points) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.isMale = isMale;
        this.isFemale = isFemale;
        this.points = points;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public Boolean getIsMale() {
        return isMale;
    }

    public Boolean getIsFemale() {
        return isFemale;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    // toString method
    // @Override
    public String toString() {
    String output;
    
    output = "First Name: " + firstName + "\n" +
        "Last Name: " + lastName + "\n" +
        "Height: " + height + "\n" +
        "Weight: " + weight + "\n" +
        "Eye Color: " + eyeColor + "\n" +
        "Hair Color: " + hairColor + "\n" +
        "Is Male:  " + isMale + "\n" +
        "Is Female: " + isFemale + "\n" +
        "Points: " + points + "\n";
    
    return output;
    }

    public static void main( String[] args )
    {

        //Instantiate a person object
        Person person = new Person("Hannah", "Hoffman", 72.0, 180.0, "Brown", "Brown", false, true, 5);

        //Print the toString object
        System.out.println(person.toString());

        //Assemble an ArrayList
        ArrayList<Person> people = new ArrayList<Person>();

        //A loop that instantiates five objects and adds them to the ArrayList
        for (int i = 0; i < 5; i++) {
            Person newPerson = new Person();
            people.add(newPerson);
        }

        //A loop that prints out all the elements of the array or ArrayList
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
        }

        //An analysis of the boolean objects
        int points = 0;
        if (person.isMale == false) {
           points = points + 5;
        } else if (person.isFemale == false) {
           points = points + 5;
        }
        System.out.println("Points: " + points);

    }
}
