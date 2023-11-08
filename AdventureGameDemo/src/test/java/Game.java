import java.util.Scanner;

public class Game {
    Player player;
    Location[] locations;
    Location inLoc;
    public void start(){

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz : ");
        String gamername = input.nextLine();
        //create player
        this.player = new Player(gamername);
        System.out.println("Sayın "+this.player.getName()+" hoşgeldiniz!");
        this.player.selectChar();
        System.out.println("Tebrikler Seçiminiz : " + this.player.getCharacter().getName());
        this.locations =new Location[] {
                 new SafeHouse(this.player, "Safe House")
                ,new ToolStore(this.player,"Mağaza")
                ,new Forest(this.player,"Orman",new Vampire())
                ,new Cave(this.player,"Mağara",new Zombie())
                ,new River(this.player,"Nehir",new Bear())
                ,new Mine(this.player,"Maden",new Snake())};
        this.inLoc = locations[0];
        while (this.inLoc.onLocation()){
            for (int i = 0;i<locations.length;i++) {
                System.out.println(i+1+") "+locations[i].getName()+" \n" );
            }
            System.out.print("Lütfen Gitmek istediğniz yeri seçiniz : ");
            int locChoose = input.nextInt()-1;
            this.inLoc = locations[locChoose];

        }
        if (this.player.getInventory().isFirewood() && this.player.getInventory().isWater() && this.player.getInventory().isFood()){
            System.out.println("Tebrikler Oyunu Kazandınız :D");
        }else{
            System.out.println("Ne yazık ki Öldünüz....");
        }



    }
}
