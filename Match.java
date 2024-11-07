public class Match{
    public int action1, action2;
    public Character shoto, shinobi;

    
    public void fighting(Character shoto, Character shinobi){

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
}
