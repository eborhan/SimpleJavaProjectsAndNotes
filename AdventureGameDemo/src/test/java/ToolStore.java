public class ToolStore extends NormalLoc {
    Armor armor;
    Weapon weapon;
    private int choosen;
    public ToolStore(Player player , String name){
        super(player,name);
    }

    @Override
    public boolean onLocation() {
        System.out.println("--------- Merhaba Mağazamıza hoşgeldiniz ------------");
        this.menu();
        return true;
    }
    public void menu(){
        Armor[] armors = new Armor[]{new Armor(1,15,"Hafif Zırh"),new Armor(3,25,"Orta Zırh"),new Armor(5,40,"Ağır Zırh")};
        Weapon[] weapons = new Weapon[]{new Weapon(2,25,"Tabanca"),new Weapon(3,35,"Kılıç"),new Weapon(7,45,"Tüfek")};
        System.out.println("Toplam paranız :"+this.getPlayer().getMoney());
        System.out.println("1)Zırhlar\n2)Silahlar\n3)Geri Dön");
        System.out.print("Lütfen Seçiminizi Yapınız : ");
        this.choosen = input.nextInt();
        if (this.choosen == 1){
            for (int i = 0;i<armors.length;i++){
                System.out.println(i+1 + " " + armors[i].getName()
                        +" " + armors[i].getArmorDefence() + " " +
                        armors[i].getPrice());
            }
            System.out.println("9 Geri Dön");
            System.out.print("Lütfen Almak istediğiniz ürünü Seçiniz : ");
            this.choosen = input.nextByte();
            if (this.choosen == 9) this.menu();
            this.buy(this.getPlayer(),armors[this.choosen-1]);
        } else if (this.choosen == 2) {
            for (int i = 0;i<weapons.length;i++){
                System.out.println(i+1 + " " + weapons[i].getName()
                        +" " + weapons[i].getWeaponDamage() + " " +
                        weapons[i].getPrice());
            };
            System.out.println("9 Geri Dön");
            System.out.print("Lütfen Almak istediğiniz ürünü Seçiniz : ");
            this.choosen = input.nextByte();
            if (this.choosen == 9) this.menu();
            this.buy(this.getPlayer(),weapons[this.choosen-1]);
        } else if (this.choosen==3) {

        } else{
            System.out.println("Yanlış Seçim Yaptınız");
            this.menu();
        }


    }
    public void buy(Player player,Armor armor){
        if (player.getMoney() >= armor.getPrice()){
           player.getInventory().setArmorDefence(armor.getArmorDefence());
           player.getInventory().setArmorName(armor.getName());
           player.setMoney(player.getMoney()-armor.getPrice());
            System.out.println("Tebrikler " + player.getInventory().getArmorName() + " Zırh Aldınız" );
            System.out.println("Kalan Paranız : " + this.getPlayer().getMoney() + " Tl");
            this.menu();
        }else{
            System.out.println("Ne Yazıkki Paranız Yetmiyor");
            this.menu();
        }
    }
    public void buy(Player player,Weapon weapon){
        System.out.println(player.getMoney() +" - "+ weapon.getPrice());
        if (player.getMoney() >= weapon.getPrice()){
            player.getInventory().setWeaponDamage(weapon.getWeaponDamage());
            player.getInventory().setWeaponName(weapon.getName());
            player.setMoney(player.getMoney()-weapon.getPrice());
            System.out.println("Tebrikler " + player.getInventory().getWeaponName() + " Aldınız ");
            System.out.println("Kalan Paranız : " + this.getPlayer().getMoney() + " Tl");
            this.menu();
        }else{
            System.out.println("Ne Yazıkki Paranız Yetmiyor");
            this.menu();
        }
    }
}
