package HW4.private_zoo;

public abstract class Animal implements Nameable {

    protected String name;

    public abstract void weight();

    public abstract void color();

    public abstract void say();

    public abstract void sleep();

    public Animal(String name) {
        this.name = name;
    }
}