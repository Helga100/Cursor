package HW4.private_zoo;

public class Monkey extends Animal {

    public Monkey(String name) {
        super(name);
    }

    @Override
    public void weight() {
        System.out.println("3 kg");
    }

    @Override
    public void color() {
        System.out.println("brown");
    }

    @Override
    public void say() {
        System.out.println("different");
    }

    @Override
    public void sleep() {
        System.out.println("7 hours");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
