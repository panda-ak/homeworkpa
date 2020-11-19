package com.company;

public class Alabai extends Dog {
    private Color color;
    private Dog dog;

    public Alabai(String name, String breed, String[] commands, Color color) {
        super(name, breed, commands);
        this.color = color;
    }


    public final void makePersonalCommand(String command){
        System.out.println(command + "Alabai");
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Alabai{" +
                "color=" + color +
                '}';
    }

    @Override
    public String getInfo() {
        return super.getInfo()+"Privet Roza pavel";

    }
}
