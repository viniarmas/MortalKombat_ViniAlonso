package mortalkombat;

public class Xbox {

    public static void main(String[] args) {
        Reptile champ1 = new Reptile();

        champ1.setSocoforte("Y");
        champ1.setSocofraco("X");
        champ1.setChuteforte("A");
        champ1.setChutefraco("B");
        champ1.setDefesa("LT e RT");
        champ1.setEspecial("LB e RB");

        System.out.println("---------------XBOX----------------  ");
        System.out.println("\n---------Configurações de Botões Reptile---------");
        System.out.println(" Soco Forte: " + champ1.getSocoforte());
        System.out.println(" Soco Fraco: " + champ1.getSocofraco());
        System.out.println(" Chute Forte: " + champ1.getChuteforte());
        System.out.println(" Chute Fraco: " + champ1.getChutefraco());
        System.out.println(" Defesa: " + champ1.getDefesa());
        System.out.println(" Especial: " + champ1.getEspecial());
        System.out.println(" Todos os personagens começam com a vida em " + champ1.getVida() + " % ");
        System.out.println("\n------------Comandos Especiais----------------");
        System.out.println("Invi: " + champ1.invisivel());
        System.out.println("Acido: " + champ1.acido());
        System.out.println("Esfera Rápido: " + champ1.bolarapida());
        System.out.println("Esfera Lenta: " + champ1.bolalenta());
        System.out.println("Combo X: " + champ1.combo1());
        System.out.println("Combo Y: " + champ1.combo2());
        System.out.println("Fatalyty X: " + champ1.fatality());
        System.out.println("Fatality Y: " + champ1.fatality1());

        Scorpion p1 = new Scorpion();

        p1.setSocoforte(" Y ");
        p1.setSocofraco(" X ");
        p1.setChuteforte(" A ");
        p1.setChutefraco(" B ");
        p1.setDefesa("LT e RT");
        p1.setEspecial("LB e RB");

        System.out.println("---------------XBOX----------------  ");
        System.out.println("\n---------Configurações de Botões--------");
        System.out.println("Soco forte: " + p1.getSocoforte());
        System.out.println("Soco fraco: " + p1.getSocofraco());
        System.out.println("Chute forte: " + p1.getChuteforte());
        System.out.println("Chute fraco: " + p1.getChutefraco());
        System.out.println("Defesa: " + p1.getDefesa());
        System.out.println("Especial: " + p1.getEspecial());
        System.out.println("Todos os personagens começam com a vida em: " + p1.getVida() + " % ");
        System.out.println("\n------------Comandos Especiais----------------");
        System.out.println("Invi: " + p1.spear());
        System.out.println("Ácido: " + p1.takedown());
        System.out.println("Esfera Rápida: " + p1.teleport());
        System.out.println("Combo X: " + p1.combo1());
        System.out.println("Combo Y: " + p1.combo2());
        System.out.println("Fatalyty X: " + p1.fatality());
        System.out.println("Fatality Y: " + p1.fatality1());

    }

}
