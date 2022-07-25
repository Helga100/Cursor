package HW4.privatezoo;

public class Main {
    public static void main(String[] args) {

        Animal elephant = new Elephant("Dambo");
        Animal fox = new Fox("Alyssa");
        Animal monkey = new Monkey("Chango");
        Animal tiger = new Tiger("Diego");
        System.out.println("Elephant`s name is " + elephant.getName());
        callAnimalMathod(elephant);
        System.out.println("Fox`s name is " + fox.getName());
        callAnimalMathod(fox);
        System.out.println("Monkey`s name is " + monkey.getName());
        callAnimalMathod(monkey);
        System.out.println("Tiger`s name is " + tiger.getName());
        callAnimalMathod(tiger);

    }

    static void callAnimalMathod(Animal animal) {
        animal.say();
        animal.color();
        animal.sleep();
        animal.weight();
    }
}


