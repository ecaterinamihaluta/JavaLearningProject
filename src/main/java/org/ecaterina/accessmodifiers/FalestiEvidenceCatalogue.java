package org.ecaterina.accessmodifiers;

import org.ecaterina.accessmodifiers.peopleevidence.Person;

public class FalestiEvidenceCatalogue {
    public static void main(String[] args) {
        Person humanOne = new Person(5565737385L, "Maia", "Sandu");
        humanOne.age = 51;
        humanOne.isMarried = false;
        humanOne.occupation = "president";
        System.out.println("HumanOne is " + humanOne.name + " with surname " + humanOne.surname + " with IDNP " + humanOne.IDNP);
        System.out.println(humanOne.toString());
        Person.printNumberOfPeople();

 //   Adding "if" and "else" condition
        if (humanOne.isMarried){
            System.out.println(" Maia Sandu is a good housewife and mother");
        } else{
            System.out.println("Maia Sandu is a good president");
        }

        Person humanTwo = new Person(5553423L, "Igor", "Dodon");
        humanTwo.isMarried = true;
        humanTwo.nationality = "Russian";
        humanTwo.emailAddress = "dodonigor@mail.ru";
        System.out.println("Human Two is " + humanTwo.name + " with surname " + humanTwo.surname + " with IDNP number " + humanTwo.IDNP + " the nationality is " + humanTwo.nationality + " is married " + humanTwo.isMarried + " with email address " + humanTwo.emailAddress);
        System.out.println(humanTwo.toString());
        Person.printNumberOfPeople();
        // Adding "if" and "else" condition
        if (humanTwo.isMarried){
            System.out.println("Igor Dodon is a familist and takes care of his family");
        }else{
            System.out.println("Igor Dodon will pretend to be a president");
        }

        Person humanThree = new Person(563536865L, "Nicolae", "Timofti");
        humanThree.emailAddress = "nicu.timofti@gmail.com";
        humanThree.occupation = "politician";
        humanThree.isMarried = true;
        humanThree.nationality = "Moldovan";
        System.out.println("Human Three is " + humanThree.name + " surname " + humanThree.surname + " the IDNP " + humanThree.IDNP + " occupation " + humanThree.occupation + " email address " + humanThree.emailAddress + " is married " + humanThree.isMarried + " nationality " + humanThree.nationality);
        System.out.println(humanThree.toString());
        Person.printNumberOfPeople();


        Person humanFour = new Person(98763435L, "Vladimir", "Voronin");
        humanFour.age = 79;
        humanFour.nationality = "Moldovan";
        System.out.println("Human Four is " + humanFour.name + " surname " + humanFour.surname + " the IDNP " + humanFour.IDNP + " age is " + humanFour.age + " nationality " + humanFour.nationality);
        System.out.println(humanFour.toString());
        Person.printNumberOfPeople();

        Person humanFive = new Person(3435267287L, "Petru", "Lucinschi");
        humanFour.age = 80;
        humanFive.isMarried = false;
        humanFive.occupation = "retired";
        System.out.println("human five is " + humanFive.name + " having the surname as " + humanFive.surname + " the IDNP is " + humanFive.IDNP + " the age is " + humanFive.age + " is married " + humanFive.isMarried + " occupation " + humanFive.occupation);
        System.out.println(humanFive.toString());
        Person.printNumberOfPeople();


    }
}
