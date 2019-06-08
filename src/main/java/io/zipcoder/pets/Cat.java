package io.zipcoder.pets;

public class Cat extends Pet {

    public Cat() {
        species ="cat";
    }

    public Cat(String name) {
        super(name);
        species ="cat";
    }

    public String speak(){
        return "You may feed me now.";
    }
}
