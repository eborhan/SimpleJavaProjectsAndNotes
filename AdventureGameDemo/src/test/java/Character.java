public abstract class Character {
    private int damage;
    private int health;
    private int money;
    private String name;
    private int idNo;
    private int orjinalHealth;


    public int getOrjinalHealth() {
        return orjinalHealth;
    }

    public void setOrjinalHealth(int orjinalHealth) {
        this.orjinalHealth = orjinalHealth;
    }

    public Character(int damage, int health, int money, String name, int idNo, int orjinalHealth) {
        this.damage = damage;
        this.health = health;
        this.money = money;
        this.name = name;
        this.idNo = idNo;
        this.orjinalHealth = orjinalHealth;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getIdNo() {
        return idNo;
    }

    public void setIdNo(int idNo) {
        this.idNo = idNo;
    }
}
