public class Game {

    public static void start() {
        Plant plant1 = new Plant();
        Zombie zombie1 = new Zombie();
            while (zombie1.hp != 0 && plant1.hp != 0) {
                zombie1.zombieAttack();
                plant1.plantTakeDmg(zombie1.dmg);
                if (plant1.hp == 0)
                break;
                plant1.plantAttack();
                zombie1.zombieTakeDmg(plant1.dmg);
            }
            if (plant1.hp == 0)
            {
                System.out.println("ZOMBIE WINS");}
            if (zombie1.hp == 0)
            {
                System.out.println("PLANT WINS");
            }


    }
}