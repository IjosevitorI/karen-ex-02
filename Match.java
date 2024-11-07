public class Match{
    public int action1, action2;
    public Character shoto, shinobi;

    
    public void fighting1(Character shoto, Character shinobi){

        action1 = shoto.lightpunch();
        action2 = shinobi.mediumpunch();
        
        if((shoto.getStartup() < shinobi.getStartup()) && (!shoto.isBlocking())){
            shinobi.setLife(shinobi.getLife() - action1);
            System.out.println(shoto.getNome() + " acertou um golpe");
        }
        else if((shoto.getStartup() > shinobi.getStartup()) && (!shinobi.isBlocking())){
            shoto.setLife(shoto.getLife() - action2);
            System.out.println(shinobi.getNome() + " acertou um golpe");
        }
        else{
            shinobi.setLife(shinobi.getLife() - action1);
            shoto.setLife(shoto.getLife() - action2);
            System.out.println("ambos se acertaram");
        }
    }

    public void fightingGrab(Grappler grappler, Character opponent) {
        action1 = grappler.commandgrab();
    
        if (!opponent.isGrabBlocking()) {
            opponent.setLife(opponent.getLife() - action1);
            System.out.println(grappler.getNome() + " acertou um command grab!");
        } 
        else {
            System.out.println(opponent.getNome() + " bloqueou o command grab de " + grappler.getNome());
        }
    }
    
    public void fightingFireball(Zoner zoner, Character opponent) {
        action1 = zoner.fireball();
        
        if (!opponent.isBlocking()) {
            opponent.setLife(opponent.getLife() - action1);
            System.out.println(zoner.getNome() + " acertou uma fireball!");
        } else {
            System.out.println(opponent.getNome() + " bloqueou a fireball de " + zoner.getNome());
        }
    }
}
