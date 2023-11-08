public abstract class Obstacle {
   private String name;
    private int damage ;
    private int health;
    private int money;
    private int number;
    private int orjHealth ;

    public int getOrjHealth() {
        return orjHealth;
    }





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Obstacle(String name, int damage, int health, int money,int orjHealth) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.orjHealth=orjHealth;

    }
}
