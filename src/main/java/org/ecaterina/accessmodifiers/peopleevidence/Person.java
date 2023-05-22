package org.ecaterina.accessmodifiers.peopleevidence;

public class Person {

    // Declaring Class Person proprieties
    public static int totalNumberOfPersonObjects;
    public final long IDNP;
    public String name;
    public String surname;
    public String emailAddress;
    public String nationality;
    public boolean isMarried;
    public String occupation;
    public int age;

    //Defining the constructor with mandatory parameters
    public Person(long IDNPMandatoryAtCreation, String name, String surname) {
        IDNP = IDNPMandatoryAtCreation;
        this.name = name;
        this.surname = surname;
    }

    //  Defining the constructor with multiple parameters that contains the mandatory IDNP,name and surname parameters too
    public Person(long IDNP, String name, String surname, boolean isMarried, String occupation, String nationality, int age, String emailAddress) {
        this.IDNP = IDNP;
        this.name = name;
        this.surname = surname;
        this.isMarried = isMarried;
        this.age = age;
        this.occupation = occupation;
        this.nationality = nationality;
        this.emailAddress = emailAddress;
        totalNumberOfPersonObjects = totalNumberOfPersonObjects + 1;
        totalNumberOfPersonObjects += 1;
        totalNumberOfPersonObjects++;
    }

    public static void printNumberOfPeople() {
        System.out.println("The number of total objects Person is =" + totalNumberOfPersonObjects);
    }

    @Override
    public String toString() {
        return "Person{" +
                "IDNP=" + IDNP +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", nationality='" + nationality + '\'' +
                ", isMarried=" + isMarried +
                ", occupation='" + occupation + '\'' +
                ", age=" + age +
                '}';
    }
}

