public class Main {
    public static void main(String[] args) {

        Character shoto = new Character("Ryu", 1000);
        Character shinobi = new Character("Ibuki", 1000);

        Match match = new Match();

        match.fighting(shoto, shinobi);

        System.out.println("Vida do(a) " + shoto.getNome() + ": " + shoto.getLife());
        System.out.println("Vida do(a) " + shinobi.getNome() + ": " + shinobi.getLife());
        
    }
}
