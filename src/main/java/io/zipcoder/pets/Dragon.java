package io.zipcoder.pets;

public class Dragon extends Pet {
    public Dragon() {
        species="dragon";
    }

    public Dragon(String name) {
        super(name);
        species="dragon";
    }

    public String speak(){
        return "*flames*";
    }
}
