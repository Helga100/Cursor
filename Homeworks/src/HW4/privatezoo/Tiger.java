package HW4.privatezoo;

public class Tiger extends Animal {

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void weight() {
        System.out.println("310 kd");
    }

    @Override
    public void color() {
        System.out.println("red striped");
    }

    @Override
    public void say() {
        System.out.println("rrrr");
    }

    @Override
    public void sleep() {
        System.out.println("10 hours");
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
