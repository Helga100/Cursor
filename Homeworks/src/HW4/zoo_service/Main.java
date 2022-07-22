package HW4.zoo_service;

public class Main {

    public static void main(String[] args) {
        ServiceStaff serviceStaff = new ServiceStaff("Ivan");
        Boss boss = new Boss("Yevheniy");
        Boss_Wife boss_wife = new Boss_Wife("Matylda");
        Boss_Son boss_son = new Boss_Son("Innokentiy");
        System.out.println(serviceStaff.getName());
        serviceStaff.deal(boss);
        serviceStaff.deal(boss_wife);
        serviceStaff.deal(boss_son, ". Could you please help me to feed animals?");

    }
}
