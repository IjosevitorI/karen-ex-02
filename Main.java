public class Main {
    public static void main(String[] args) {

        Character shoto = new Character("Ryu", 1000);
        Grappler grappler = new Grappler("Zangief", 1200);
        Zoner zoner = new Zoner("Dhalsim", 1000);

        Match match = new Match();

        match.fighting1(shoto, zoner);

        match.fightingGrab(grappler, shoto);

        match.fightingFireball(zoner, shoto);

        System.out.println("Vida do(a) " + shoto.getNome() + ": " + shoto.getLife());
        System.out.println("Vida do(a) " + grappler.getNome() + ": " + grappler.getLife());
        System.out.println("Vida do(a) " + zoner.getNome() + ": " + zoner.getLife());
        
    }
}
