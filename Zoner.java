public class Zoner extends Character{

    
    public Zoner(String nome, double life){
        super(nome, life);
    }

    public int fireball(){
        setBlocking(false);
        setGrabBlocking(false);
        setStartup(10);
        int damage = 80;
        return damage;
    }
}