public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player,String name){
        super(player,name);
    }
    @Override
    public boolean onLocation() {
        System.out.println("Güvenli eve hoşgeldiniz");
        this.getPlayer().setHealth(this.getPlayer().getCharacter().getOrjinalHealth());
        System.out.println("canınız fullendi");
        if (this.getPlayer().getInventory().isFirewood() && this.getPlayer().getInventory().isWater() && this.getPlayer().getInventory().isFood()){
            return false;
        }
        return true;
    }
}
