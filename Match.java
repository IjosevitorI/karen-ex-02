public class Match{
    public int action1, action2;
    public Character shoto, shinobi;

    
    public void fighting(Character shoto, Character shinobi){

        action1 = shoto.lightpunch();
        action2 = shinobi.mediumpunch();
        
        if(shoto.getStartup() < shinobi.getStartup()){
            shinobi.setLife(shinobi.getLife() - action1); 
        }
        else if(shoto.getStartup() > shinobi.getStartup()){
            shoto.setLife(shoto.getLife() - action2);
        }
        else{
            shinobi.setLife(shinobi.getLife() - action1);
            shoto.setLife(shoto.getLife() - action2);
        }
    }
}
