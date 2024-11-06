public class Main {
    public static void main(String[] args) {

        Character shoto = new Character();
        Character shinobi = new Character();

        Match match = new Match();

        match.fighting(shoto, shinobi);

        System.out.println("Vida do Shoto: " + shoto.life);
        System.out.println("Vida do Shinobi: " + shinobi.life);
        
    }
}
