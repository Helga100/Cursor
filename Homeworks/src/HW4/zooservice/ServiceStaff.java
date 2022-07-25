package HW4.zooservice;

public class ServiceStaff extends Person {

    public ServiceStaff(String name) {
        super(name);
    }

    public void deal(Boss boss) {
        System.out.println("Hello, Mr. " + boss.getName() + ", animals are fine!");
    }

    public void deal(BossSon boss_son, String message) {
        System.out.println("Hello, " + boss_son.getName() + message);
    }

    public void deal(BossWife boss_wife) {
        System.out.println("Hello, Mrs. " + boss_wife.getName() + ". Your husband is already at home.");
    }
}
