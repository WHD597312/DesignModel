package com.ph.datastructure;

public class Item {
    private String name;
    private int age;

    public Item(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Item item= (Item) obj;
        if (this.name.equals(item.name) && this.age==item.age)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
