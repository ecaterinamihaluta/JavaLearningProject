package org.ecaterina.classesandobjects.autoservicetask;

public class Car {
    String plateNumber;
    int kmWhenEnteredTheService;
    String color;
    String manufacturer;
    String model;

    // The constructor below receives the first 3 entrance parameters, in result an object Car is created about which we will know the manufacturer,
    // the model, the km made when entered the service
    Car(String manufacturerParametruDeIntrare, String modelFormalParameter, int kmWhenEnteredTheService) {
        this.manufacturer = manufacturerParametruDeIntrare;
        this.kmWhenEnteredTheService = kmWhenEnteredTheService;
        this.model = modelFormalParameter;

    }
    // This constructor will create an object with type Car about which we will know only the plate number and the color
    Car(String plateNumber, String color){
        this.plateNumber = plateNumber;
        this.color = color;

    }


}
