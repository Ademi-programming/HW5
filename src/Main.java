public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setDamage(300);
        boss.setTypeOfDefence("Magical");
        System.out.println("Boss information: ");
        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss type of defence: " + boss.getTypeOfDefence());
        Hero [] heroes = createHeroes();
        for (Hero hero: heroes) {
            System.out.println("heroes health " + hero.getHealth());
            System.out.println("heroes damage " + hero.getDamage());
            System.out.println("heroes superpower " + hero.getSuperPower());
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 300 , "Magical");
        Hero hero2 = new Hero( 200, 100 , "Physical");
        Hero hero3 = new Hero( 500, 50);
        return new Hero [] {
                hero1 , hero2 , hero3
        };
    }
}

