package HW4.zooservice;

import HW4.privatezoo.Nameable;

public abstract class Person implements Nameable {
    private final String name;

    protected Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
