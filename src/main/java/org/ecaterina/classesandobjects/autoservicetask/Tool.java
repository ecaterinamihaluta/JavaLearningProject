package org.ecaterina.classesandobjects.autoservicetask;

public class Tool {
    double price;
    String name;
    double weight;


    public  Tool(String name){
        this.name = name;

        System.out.println("An object of tool type was created, the name is" + this.name);

    }
    public Tool(){
        System.out.println("A new tool was created in this program. We don't have the details"
                +"for details Name is" +this.name + "and for weight is" + this.weight );
    }

}
