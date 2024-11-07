public class Grappler extends Character{

    
    public Grappler(String nome, double life){
        super(nome, life);
    }

    public int commandgrab(){
        setBlocking(false);
        setGrabBlocking(false);
        setStartup(12);
        int damage = 180;
        return damage;
    }
}