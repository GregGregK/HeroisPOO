public class Guerreiro {
    public int AtaqueGuerreiro = 30;
    public int DefesaGuerreiro = 20;
    public int PvdGuerreiro = 180;

    public int getAtaqueGuerreiro() {
        return AtaqueGuerreiro;
    }
    public void setAtaqueGuerreiro(int ataqueGuerreiro) {
        AtaqueGuerreiro = ataqueGuerreiro;
    }
    public int getDefesaGuerreiro() {
        return DefesaGuerreiro;
    }
    public void setDefesaGuerreiro(int defesaGuerreiro) {
        DefesaGuerreiro = defesaGuerreiro;
    }
    public int getPvdGuerreiro() {
        return PvdGuerreiro;
    }
    public void setPvdGuerreiro(int pvdGuerreiro) {
        PvdGuerreiro = pvdGuerreiro;
    }

    void guerreiroStatus(){
        System.out.format("O Guerreiro possue: %s de ataque, %d de defesa (Vida: %d)", this.AtaqueGuerreiro, this.DefesaGuerreiro, this.PvdGuerreiro);
    }
}
