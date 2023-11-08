public class Armor {
    private int armorDefence;
    private int price;
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmorDefence() {
        return armorDefence;
    }

    public void setArmorDefence(int armorDefence) {
        this.armorDefence = armorDefence;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Armor(int armorDefence, int price, String name) {
        this.armorDefence = armorDefence;
        this.price = price;
        this.name = name;
    }
}
