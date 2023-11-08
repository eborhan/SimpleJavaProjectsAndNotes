import java.util.Random;

public abstract class BattleLoc extends Location {
    Obstacle osbstacle;
    public BattleLoc(Player player,String name,Obstacle osbstacle){
        super(player,name);
        this.osbstacle = osbstacle;
    }



    @Override
    public boolean onLocation() {
        System.out.print(this.getName() + " e hoşgeldiniz Burada " +this.osbstacle.getNumber() + " adet " + this.osbstacle.getName()+" vardır :"+this.osbstacle.getDamage() +"\n 1)Savaş \n 2)Kaç");
        int choosencombat = input.nextInt();
        if (choosencombat == 1){
            if (osbstacle.getNumber()>0){
                 combat();
            }else{
                System.out.println(this.getName()+" Savaşı Bitmiştir.");
                switch (this.getName()){
                    case  "Orman":
                        if (this.getPlayer().getInventory().isFirewood()){
                            System.out.println("Zaten Ödülü Aldınız");
                        }else{
                            this.getPlayer().getInventory().setFirewood(true);
                            System.out.println("Ateş Ödülünü Aldınız");
                        }
                        break;
                    case "Nehir":
                        if (this.getPlayer().getInventory().isWater()){
                            System.out.println("Zaten Ödülü Aldınız");
                        }else{
                            this.getPlayer().getInventory().setWater(true);
                            System.out.println("Su Ödülünü Aldınız");
                        }
                        break;
                    case "Mağara":
                        if (this.getPlayer().getInventory().isFood()){
                            System.out.println("Zaten Ödülü Aldınız");
                        }else{
                            this.getPlayer().getInventory().setFood(true);
                            System.out.println("Yemek Ödülünü Aldınız");
                        }
                        break;
                }


            }
        } else if (choosencombat==2) {

        }
        if (getPlayer().getHealth()>0){
            return true;
        }else{
            return false;
        }

    }

    public boolean combat(){
        System.out.println("Savaşa Hoş Geldiniz");
        this.osbstacle.setHealth(this.osbstacle.getOrjHealth());
            int randomAttack = new Random().nextInt(1,3);
            if (randomAttack==1){
                System.out.println("İlk Siz Saldırıyorsunuz");
                FirstPlayer();
            }else {
                System.out.println("Canavar Saldırıyor");
                firstObs();
            }
        if (this.getPlayer().getHealth()>0) return true;
        else return false;
    }
    public void earnWealth(Armor armor){
        this.getPlayer().getInventory().setArmorName(armor.getName());
        this.getPlayer().getInventory().setArmorDefence(armor.getArmorDefence());
        System.out.println(this.getPlayer().getInventory().getArmorName() + " ı Aldınız");
    }
    public void earnWealth(Weapon weapon){
        this.getPlayer().getInventory().setWeaponName(weapon.getName());
        this.getPlayer().getInventory().setWeaponDamage(weapon.getWeaponDamage());
        System.out.println(this.getPlayer().getInventory().getWeaponName() + "  Aldınız");
    }
    public void MineCombat(){
        Armor[] armors = new Armor[]{new Armor(1,15,"Hafif Zırh"),new Armor(3,25,"Orta Zırh"),new Armor(5,40,"Ağır Zırh")};
        Weapon[] weapons = new Weapon[]{new Weapon(2,25,"Tabanca"),new Weapon(3,35,"Kılıç"),new Weapon(7,45,"Tüfek")};
        int randomval = new Random().nextInt(0,100);
        int randomval2 = new Random().nextInt(0,100);
        if (randomval<16){
            if (randomval2<51){
                earnWealth(armors[0]);
            } else if (randomval2<81) {
                earnWealth(armors[1]);
            }else {
                earnWealth(armors[2]);
            }
        } else if (randomval<31) {
            if (randomval2<51){
                earnWealth(weapons[0]);
            } else if (randomval2<81) {
                earnWealth(weapons[1]);
            }else {
                earnWealth(weapons[2]);
            }
        } else if (randomval<56) {
            if (randomval2<51){
                this.getPlayer().setMoney(this.getPlayer().getMoney()+1);
                System.out.println("1 tl kazandınız :D Şimdiki Paranız : " + this.getPlayer().getMoney());
            } else if (randomval2<81) {
                this.getPlayer().setMoney(this.getPlayer().getMoney()+5);
                System.out.println("5 tl kazandınız :D Şimdiki Paranız : "+ this.getPlayer().getMoney());
            }else {
                this.getPlayer().setMoney(this.getPlayer().getMoney()+10);
                System.out.println("10 tl kazandınız :D Şimdiki Paranız : "+ this.getPlayer().getMoney());

            }
        }else{
            System.out.println("Ne yazık ki bişey Kazanamadınız :(");
        }

    }
    public void FirstPlayer(){
        while (this.getPlayer().getHealth()>0 && this.osbstacle.getHealth()>0){
            System.out.println(this.getPlayer().getInventory().getWeaponName() +" ile Vuruyorsunuz........");
            this.osbstacle.setHealth(this.osbstacle.getHealth()-(this.getPlayer().getDamage()+this.getPlayer().getInventory().getWeaponDamage()));
            System.out.println(this.osbstacle.getName()+" Canı "+this.osbstacle.getHealth()+ " kaldı.....");
            if (this.osbstacle.getHealth()>0){
                System.out.println(this.osbstacle.getName() + " vuruyor");
                System.out.println(this.getPlayer().getInventory().getArmorName() + " ile Savunuyorsunuz.......");
                int totaldamage = this.osbstacle.getDamage()-this.getPlayer().getInventory().getArmorDefence();
                if (totaldamage < 0 ) totaldamage = 0;
                this.getPlayer().setHealth(this.getPlayer().getHealth()-(totaldamage));
                System.out.println("Canınız "+this.getPlayer().getHealth()+" kaldı.....");
            }else {
                System.out.println(this.osbstacle.getNumber() + ". Canavar öldü !!!");
                this.osbstacle.setNumber(this.osbstacle.getNumber()-1);
                if (this.getName()=="Maden"){
                    MineCombat();
                }else{
                    this.getPlayer().setMoney(this.getPlayer().getMoney()+this.osbstacle.getMoney());
                    System.out.println("Tebrikler " +this.osbstacle.getMoney() + " Tl Kazandınız...."  );
                    System.out.println("Toplam Paranız : " + this.getPlayer().getMoney() + " Tl oldu........");
                }


            }
        }

    }
    public void firstObs() {
        while (this.getPlayer().getHealth() > 0 && this.osbstacle.getHealth() > 0) {
                System.out.println(this.osbstacle.getName() + " vuruyor");
                System.out.println(this.getPlayer().getInventory().getArmorName() + " ile Savunuyorsunuz.......");
                int totaldamage = this.osbstacle.getDamage() - this.getPlayer().getInventory().getArmorDefence();
                if (totaldamage < 0) totaldamage = 0;
                this.getPlayer().setHealth(this.getPlayer().getHealth() - (totaldamage));
                System.out.println("Canınız " + this.getPlayer().getHealth() + " kaldı.....");
                System.out.println(this.getPlayer().getInventory().getWeaponName() + " ile Vuruyorsunuz........");
                this.osbstacle.setHealth(this.osbstacle.getHealth() - (this.getPlayer().getDamage() + this.getPlayer().getInventory().getWeaponDamage()));
                System.out.println(this.osbstacle.getName() + " Canı " + this.osbstacle.getHealth() + " kaldı.....");
             if (this.osbstacle.getHealth() < 1) {
                System.out.println(this.osbstacle.getNumber() + ". Canavar öldü !!!");
                this.osbstacle.setNumber(this.osbstacle.getNumber() - 1);
                if (this.getName() == "Maden") {
                    MineCombat();
                } else {
                    this.getPlayer().setMoney(this.getPlayer().getMoney() + this.osbstacle.getMoney());
                    System.out.println("Tebrikler " + this.osbstacle.getMoney() + " Tl Kazandınız....");
                    System.out.println("Toplam Paranız : " + this.getPlayer().getMoney() + " Tl oldu........");
                }
            }

        }
    }
}
