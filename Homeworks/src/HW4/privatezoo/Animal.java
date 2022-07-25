package HW4.privatezoo;

public abstract class Animal implements Nameable {

    private final String name;

    public abstract void weight();

    public abstract void color();

    public abstract void say();

    public abstract void sleep();

    protected Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}