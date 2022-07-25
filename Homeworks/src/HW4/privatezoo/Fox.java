package HW4.privatezoo;

public class Fox extends Animal {

    public Fox(String name) {
        super(name);
    }

    @Override
    public void weight() {
        System.out.println("6 kg");
    }

    @Override
    public void color() {
        System.out.println("red");
    }

    @Override
    public void say() {
        System.out.println("yow");
    }

    @Override
    public void sleep() {
        System.out.println("5 hours");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
