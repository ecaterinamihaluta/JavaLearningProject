package org.ecaterina.classesandobjects.autoservicetask;


public class ManageAutoService {
    public static void main(String[] args) {
        Car jaguarXe = new Car("Jaguar", "XE", 50000);

        jaguarXe.plateNumber = "MDK 123";
        jaguarXe.color = "Red";

        System.out.println("Car" + jaguarXe.manufacturer + "model" + jaguarXe.model + "color" + jaguarXe.color + "having plate number" + jaguarXe.plateNumber + "kilometers on board" + jaguarXe.kmWhenEnteredTheService);

        Car fiatPunto = new Car("HFR 566", "black");

        fiatPunto.manufacturer = "Fiat";
        fiatPunto.kmWhenEnteredTheService = 90123;
        fiatPunto.model = "Class";

        System.out.println("Car" + fiatPunto.manufacturer + "model" + fiatPunto.model + "color" + fiatPunto.color + "having plate number" + fiatPunto.plateNumber + "kilometers on board" + fiatPunto.kmWhenEnteredTheService);


        Tool knife = new Tool("knife");
        knife.weight = 0.55;
        knife.price = 45.99;

        System.out.println("The tool name is" + knife.name + "with the weight of" + knife.weight + "and the price is" + knife.price);

        Tool hammer = new Tool("hammer");
        hammer.price = 75.00;
        hammer.weight = 2.6;
        System.out.println("The tool name is" + knife.name + "with the weight of" + knife.weight + "and the price is" + knife.price);


        Worker newEmployee = new Worker();
        newEmployee.name = "Alex";
        newEmployee.age = 37;
        newEmployee.gender = "male";
        newEmployee.weight = 83.5;
        newEmployee.height = 1.87;
        System.out.println("The new employee is called" + newEmployee.name + "his age is" + newEmployee.age + "his gender is" + newEmployee.gender + "his weight is" + newEmployee.weight + " and his his height is" + newEmployee.height);

        Garage garageChisinau = new Garage();
        garageChisinau.name = "Starcar";
        garageChisinau.address = "Str.Studentilor 9";
        garageChisinau.carCapacity = 20;
        garageChisinau.hasComputerDiagnostics = true;
        System.out.println("Garage name is" + garageChisinau.name + "address" + garageChisinau.address + "the car capacity is" + garageChisinau.carCapacity + "has computer diagnostics" + garageChisinau.hasComputerDiagnostics);


    }
}
