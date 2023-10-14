public class Main {
    public static void main(String[] args) {
       Boss boss=new Boss(); //устонавить
       boss.setHealth(600);
       boss.setDamage(50);
       boss.setProtection("Mag");
       System.out.println(boss.getHealth()+" "+boss.getDamage()+" " + boss.getProtection());
       //получить

    }
}