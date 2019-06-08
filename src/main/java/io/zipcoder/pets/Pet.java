package io.zipcoder.pets;

public abstract class Pet implements Comparable<Pet> {

    private String name;
    String species;

    public Pet() {
        this.name="";
    }

    public Pet(String name) {
        this.name = name;
    }


    public String getSpecies() { return species;}

    abstract String speak();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "Your pet named " +
                this.getName() + " is a " + this.getSpecies() + ".\n" +
                initCap(this.name) + " always likes to say: \"" + this.speak() + "\".\n";
    }

    private String initCap(String input){
        return Character.toUpperCase(input.charAt(0))+input.substring(1);
    }

    public int compareTo(Pet other){
        int compareName = this.getName().compareTo(other.getName());
        if(compareName!=0)return compareName;
        return this.getSpecies().compareTo(other.getSpecies());
    }


}
