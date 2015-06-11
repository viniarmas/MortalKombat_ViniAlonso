package mortalkombat;

public class Playstation {

    public static void main(String[] args) {
        Reptile champ2 = new Reptile();

        champ2.setSocoforte("Triangulo");
        champ2.setSocofraco("Quadrado");
        champ2.setChuteforte("Xis");
        champ2.setChutefraco("Bolinha");
        champ2.setDefesa("L2 e R2");
        champ2.setEspecial("L1 e R1");

        System.out.println("---------------PLAY STATION-----------------");
        System.out.println("\n------------Configurações de Botões-----------");
        System.out.println("Soco forte: " + champ2.getSocoforte());
        System.out.println("Soco fraco: " + champ2.getSocofraco());
        System.out.println("Chute forte: " + champ2.getChuteforte());
        System.out.println("Chute fraco: " + champ2.getChutefraco());
        System.out.println("Defesa: " + champ2.getDefesa());
        System.out.println("Especial: " + champ2.getEspecial());
        System.out.println("Todos os personagens começam com a vida em " + champ2.getVida() + " % ");
        System.out.println("\n------------Comandos Especiais----------------");
        System.out.println("Invi: " + champ2.invisivel());
        System.out.println("Ácido: " + champ2.acido());
        System.out.println("Esfera Rápida: " + champ2.bolarapida());
        System.out.println("Esfera Lenta: " + champ2.bolalenta());
        System.out.println("Combo X: " + champ2.combo1());
        System.out.println("Combo Y: " + champ2.combo2());
        System.out.println("Fatalyty X: " + champ2.fatality());
        System.out.println("Fatality Y: " + champ2.fatality1());

    }

}
