package mortalkombat;

public class Subzero {

    private String socoforte;
    private String socofraco;
    private String chuteforte;
    private String chutefraco;
    private String defesa;
    private String agarra;
    private String especial;
    private Integer life;

    public Subzero() {
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

    public String gelofrente() {

        return "atras, baixo,  " + socoforte;

    }

    public String gelochao() {
        return "Baixo, frente, " + chuteforte;
    }

    public String slide() {
        return "Esquerda, direita, " + socofraco;
    }

    public String combo1() {
        return socofraco + ", " + socofraco + ", " + socoforte;
    }

    public String combo2() {
        return chutefraco + ", " + socoforte + ", " + chuteforte;
    }

    public String fatality1() {
        return "atras, frente, baixo, frente, " + chutefraco + "distância de uma rasteira. ";
    }

    public String fatality() {
        return "Bbixo, atras, baixo, frente,  " + socoforte + "distância de uma rasteira. ";
    }

    private String supergelo() {
        return "Baixo, atras," + chuteforte + " cima, baixo, " + agarra;

    }
}
