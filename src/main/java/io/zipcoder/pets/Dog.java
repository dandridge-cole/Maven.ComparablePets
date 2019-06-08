package io.zipcoder.pets;


public class Dog extends Pet {

    public Dog() {species="dog";}

    public Dog(String name) {
        super(name);
        species="dog";
    }

    public String speak(){
        return "Sqirrel!";
    }

}
