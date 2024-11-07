public class Zoner extends Character implements Fireballuser{
    private boolean ofencfireball = false;
    
    public Zoner(String nome, double life){
        super(nome, life);
    }

    public int fireball(){
        setBlocking(false);
        setGrabBlocking(false);
        setStartup(10);
        int damage = 80;
        ofencfireball = true;
        return damage;
    }

    @Override
    public int specialAttack() {
        if (ofencfireball && !isBlocking() && !isGrabBlocking()) {
            setStartup(6);
            int damage = 100;
            ofencfireball = false;
            System.out.println(getNome() + " usou uma sequência de fireball!");
            return damage;
        } else {
            System.out.println(getNome() + " não pode usar a sequência de fireball agora.");
            return 0;
        }
    }

    @Override
    public int lightpunch() {
        setBlocking(false);
        setGrabBlocking(false);
        setStartup(3);
        int damage = 25;
        setOfenciva(true);
        return damage;
    }

    @Override
    public int mediumpunch() {
        setBlocking(false);
        setGrabBlocking(false);
        setStartup(5);
        int damage = 55;
        setOfenciva(true);
        return damage;
    }

    @Override
    public int heavypunch() {
        setBlocking(false);
        setGrabBlocking(false);
        setStartup(7);
        int damage = 75;
        setOfenciva(true);
        return damage;
    }
}