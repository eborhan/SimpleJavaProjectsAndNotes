import java.util.Scanner;

public class Player {
    private  Inventory inventory;
    private Character character;
    private int damage;
    private int health;
    private int money;
    private String name;

    public Player(String name){
        this.name = name;
    }
    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
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

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public void selectChar(){
        Character samurai = new Samurai(5,21,15,"Samurai",1,21);
        Character archer = new Archer(7,18,20,"Archer  ",2,18);
        Character knight = new Knight(8,24,5,"Knight  ",3,24);
        Character[] characters= {samurai,archer,knight};
        for (int i =0;i<characters.length;i++){
            System.out.print(characters[i].getIdNo() + "\t "
                    +characters[i].getName() + "\t "
                    +characters[i].getDamage()+"\t "
                    +characters[i].getHealth() + "\t "
                    + characters[i].getMoney()+"\n");

        }
        System.out.print(" Lütfen bir char seçiniz : ");
        Scanner in = new Scanner(System.in);
        int charchoose = in.nextInt();
        switch (charchoose){
            case 2:
                this.character = archer;
                break;
            case 3:
                this.character = knight;
                break;
            case 1:
            default:
                this.character = samurai;
                break;
        }
        this.damage=this.character.getDamage();
        this.health = this.character.getHealth();
        this.money = this.character.getMoney();
        this.inventory = new Inventory(false,false,false,"El","Zırhsız",0,0);
    }
}
