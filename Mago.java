public class Mago {
    public int AtaqueMago = 20;
    public int DefesaMago = 10;
    public int PvdMago = 200;

    public int getAtaqueMago() {
        return AtaqueMago;
    }
    public void setAtaqueMago(int ataqueMago) {
        AtaqueMago = ataqueMago;
    }
    public int getDefesaMago() {
        return DefesaMago;
    }
    public void setDefesaMago(int defesaMago) {
        DefesaMago = defesaMago;
    }
    public int getPvdMago() {
        return PvdMago;
    }
    public void setPvdMago(int pvdMago) {
        PvdMago = pvdMago;
    }

    void statusMago(){
        System.out.format("O Mago possue: %s de ataque, %d de defesa (vida: %s),", this.AtaqueMago, this.DefesaMago, this.PvdMago);
    }
}
