public class Character{
    private double life;
    private boolean blocking = false;
    private boolean grabblocking = false;
    private int startup;
    private String nome;
    private boolean ofenciva = false;

    public Character(String nome, double life){
        this.nome = nome;
        this.life = life;
        System.out.println(getNome() + " entrou no combate");
    }

    public String getNome(){
        return nome;
    }
    
    public void setLife(double life){
        this.life = life;
    }

    public double getLife(){
        return life;
    }
    
    public void setStartup(int startup){
        this.startup = startup;
    }

    public int getStartup(){
        return startup;
    }
    
    public boolean isBlocking() {
        return blocking;
    }

    public void setBlocking(boolean blocking) {
        this.blocking = blocking;
    }

    public boolean isGrabBlocking() {
        return grabblocking;
    }

    public void setGrabBlocking(boolean grabblocking) {
        this.grabblocking = grabblocking;
    }

    public boolean isOfenciva() {
        return ofenciva;
    }

    public void setOfenciva(boolean ofenciva) {
        this.ofenciva = ofenciva;
    }
    
    public int lightpunch(){
        setBlocking(false);
        setGrabBlocking(false);
        setStartup(4);
        int damage = 30;
        setOfenciva(true);
        return damage;
    }

    public int mediumpunch(){
        setBlocking(false);
        setGrabBlocking(false);
        setStartup(6);
        int damage = 60;
        setOfenciva(true);
        return damage;
    }

    public int heavypunch(){
        setBlocking(false);
        setGrabBlocking(false);
        setStartup(8);
        int damage = 80;
        setOfenciva(true);
        return damage;
    }

    public int specialAttack() {
        if (ofenciva && !blocking && !grabblocking) {
            setStartup(3);
            int damage = 50;
            ofenciva = false;
            System.out.println(getNome() + " usou um ataque sequencial após um soco!");
            return damage;
        } else {
            System.out.println(getNome() + " não pode usar o ataque sequencial no momento.");
            return 0;
        }
    }
    
}
