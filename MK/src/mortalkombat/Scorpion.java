package mortalkombat;

public class Scorpion {

    private String socoforte;
    private String socofraco;
    private String chuteforte;
    private String chutefraco;
    private String defesa;
    private String agarra;
    private String especial;
    private Integer life;

    public Scorpion() {
        this.socoforte = null;
        this.socofraco = null;
        this.chuteforte = null;
        this.chutefraco = null;
        this.defesa = null;
        this.agarra = null;
        this.especial = null;
        this.life = 100;
    }

    public Integer getVida() {
        return this.life;
    }

    public void setVida(Integer vida) {
        this.life = vida;
    }

    public String getSocoforte() {
        return this.socoforte;
    }

    public void setSocoforte(String socoforte) {
        this.socoforte = socoforte;
    }

    public String getSocofraco() {
        return this.chutefraco;
    }

    public void setSocofraco(String socofraco) {
        this.socofraco = socofraco;
    }

    public String getChuteforte() {
        return this.chuteforte;
    }

    public void setChuteforte(String chuteforte) {
        this.chuteforte = chuteforte;
    }

    public String getChutefraco() {
        return this.chutefraco;
    }

    public void setChutefraco(String chutefraco) {
        this.chutefraco = chutefraco;
    }

    public String getDefesa() {
        return this.defesa;
    }

    public void setDefesa(String defesa) {
        this.defesa = defesa;
    }

    public String getAgarra() {
        return this.agarra;
    }

    public void setAgarra(String agarra) {
        this.agarra = agarra;
    }

    public String getEspecial() {
        return this.especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }

    public String spear() {

        return "Atras, atras, " + socofraco;

    }

    public String takedown() {
        return "Baixo, frente, " + chutefraco;
    }

    public String teleport() {
        return "Baixo, atras, " + chutefraco;
    }

    public String combo1() {
        return "Esquerda, baixo, " + socofraco + ", " + socoforte;
    }

    public String combo2() {
        return chutefraco + ", " + chutefraco + ", " + socoforte;
    }

    public String fatality1() {
        return "Frente, baixo , frente, atras, esquerda, " + socoforte + "encostado no inimigo. ";
    }

    public String fatality() {
        return "atras, frente, atras, cima, baixo, " + chuteforte + "encostado no inimigo. ";
    }

    private String airdeamon() {
        return "atras, atras, " + socoforte + "encostado no inimigo. ";
    }

}
