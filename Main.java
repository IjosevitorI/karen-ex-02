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
        
        System.out.println("Dano do soco leve: " + grappler.lightpunch());
        System.out.println("Dano do ataque especial: " + grappler.specialAttack());

        System.out.println("Dano da fireball: " + zoner.fireball());
        System.out.println("Dano da sequência de fireball: " + zoner.specialAttack());

        System.out.println("Dano do soco médio: " + shoto.mediumpunch());
        System.out.println("Dano do ataque especial: " + shoto.specialAttack());

        Fireballuser fireballCharacter = zoner; // Polimorfismo
        System.out.println("Dano da fireball usando a interface: " + fireballCharacter.fireball());
    }
}
