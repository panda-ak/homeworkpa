package com.company;

public class Pet {

    private int age = generateDefaultAge();
    private Color color;
    private Shelter shelter;

    public Pet() {

        this.age = age;
        this.color = color;
        this.shelter = shelter;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public int getAge() {
        return age;
    }

    private int generateDefaultAge() {
        /*Random r = new Random();
        return r.nextInt(20)+1;*/

        return (int)(Math.random()*10+5);
    }


    public String getInfo() {
        return "Pet = { age = "+age+", color = "+color+", Shelter = "+shelter+"}";
    }


}
