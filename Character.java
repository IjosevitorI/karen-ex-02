public class Character{
    private double life;
    private boolean blocking = false;
    private boolean grabblocking = false;
    private int startup;
    private String nome;

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
    
    public int lightpunch(){
        setBlocking(false);
        setStartup(4);
        int damage = 30;
        return damage;
    }

    public int mediumpunch(){
        setBlocking(false);
        setStartup(6);
        int damage = 60;
        return damage;
    }

    public int heavypunch(){
        setBlocking(false);
        setStartup(8);
        int damage = 80;
        return damage;
    }
    
}
