package io.zipcoder.pets;

public abstract class Pet {

    private String name;
    String species;

    abstract String speak();


    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Your pet named " +
                this.getName() + " is a " + this.species + ".\n" +
                initCap(this.name) + " always likes to say: \"" + this.speak() + "\".\n";
    }

    private String initCap(String input){
        return Character.toUpperCase(input.charAt(0))+input.substring(1);
    }
}
