public class Match{
    public int action1, action2;
    public Character shoto, shinobi;

    
    public void fighting(Character shoto, Character shinobi){

        action1 = shoto.lightpunch();
        action2 = shinobi.mediumpunch();
        
        if(shoto.starup < shinobi.starup){
            shinobi.life -= action1; 
        }
        else if(shoto.starup > shinobi.starup){
            shoto.life -= action2;
        }
        else{
            shinobi.life -= action1;
            shoto.life -= action2;
        }
    }
}
