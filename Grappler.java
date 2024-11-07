public class Grappler extends Character{
    private boolean ofencdegrab = false;
    
    public Grappler(String nome, double life){
        super(nome, life);
    }

    public int commandgrab(){
        setBlocking(false);
        setGrabBlocking(false);
        setStartup(12);
        int damage = 180;
        ofencdegrab = true;
        return damage;
    }

    @Override
    public int specialAttack() {
        if (ofencdegrab && !isBlocking() && !isGrabBlocking()) {
            setStartup(5);
            int damage = 150;
            ofencdegrab = false;
            System.out.println(getNome() + " usou uma sequência de agarrão!");
            return damage;
        } else {
            System.out.println(getNome() + " não pode usar a sequência de agarrão agora.");
            return 0;
        }
    }

    @Override
    public int lightpunch() {
        setBlocking(false);
        setGrabBlocking(false);
        setStartup(5);
        int damage = 35;
        setOfenciva(true);
        return damage;
    }

    @Override
    public int mediumpunch() {
        setBlocking(false);
        setGrabBlocking(false);
        setStartup(7);
        int damage = 70;
        setOfenciva(true);
        return damage;
    }

    @Override
    public int heavypunch() {
        setBlocking(false);
        setGrabBlocking(false);
        setStartup(10);
        int damage = 90;
        setOfenciva(true);
        return damage;
    }
}