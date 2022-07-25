package HW4.zooservice;

public class Main {

    public static void main(String[] args) {
        ServiceStaff serviceStaff = new ServiceStaff("Ivan");
        Boss boss = new Boss("Yevheniy");
        BossWife boss_wife = new BossWife("Matylda");
        BossSon boss_son = new BossSon("Innokentiy");
        System.out.println(serviceStaff.getName());
        serviceStaff.deal(boss);
        serviceStaff.deal(boss_wife);
        serviceStaff.deal(boss_son, ". Could you please help me to feed animals?");

    }
}
