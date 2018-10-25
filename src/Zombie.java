public class Zombie {
    int hp = 100;
    int dmg = 10;

    public Zombie(int hpZombie, int dmgZombie) {
        this.hp = hpZombie;
        this.dmg = dmgZombie;
    }

    public Zombie()
    {this.hp = 100;
    this.dmg = 10;
    }

    public int zombieAttack()
    {System.out.println("The Zombie attacks the Plant");
        return dmg;}

    public int zombieTakeDmg(int dmgTaken)
    { hp -= dmgTaken;
        System.out.println("The zombie has " + hp + " HP left");
        return hp;
    }


}
