package HW4.privatezoo;

public class Elephant extends Animal {

    public Elephant(String name) {
        super(name);
    }

    @Override
    public void weight() {
        System.out.println("5 tons");
    }

    @Override
    public void color() {
        System.out.println("Grey");
    }

    @Override
    public void say() {
        System.out.println("ugh");
    }

    @Override
    public void sleep() {
        System.out.println("8 hours");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
