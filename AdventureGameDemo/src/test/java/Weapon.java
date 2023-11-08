public class Weapon {
    private int weaponDamage;
    private int price;
    private String name;

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon(int weaponDamage, int price, String name) {
        this.weaponDamage = weaponDamage;
        this.price = price;
        this.name = name;
    }
}
