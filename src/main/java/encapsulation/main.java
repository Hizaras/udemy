package encapsulation;

public class main {
public static void main(String[] args) {

//    Player player = new Player();
//    player.name = "Tim";
//    player.health = 20;
//    player.weapon = "sword";
//
//    int damage = 10;
//    player.looseHealth(damage);
//    System.out.println("Remaing health =  " + player.healthRemaining());
//
//     damage = 11;
//     player.looseHealth(damage);
//    System.out.println("Remaing health =  " + player.healthRemaining());
    EnhancedPlayer player = new EnhancedPlayer("Tim",200, "sword");
    System.out.println(player.getHitPoints());
}

}
