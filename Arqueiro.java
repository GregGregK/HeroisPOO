import java.util.Scanner;
public class Arqueiro extends Dragao {
    public int AtaqueArqueiro = 20;
    public int DefesaArqueiro = 30;
    public int PvdArqueiro = 160;

    public int getAtaqueArqueiro() {
        return AtaqueArqueiro;
    }

    public void setAtaqueArqueiro(int ataqueArqueiro) {
        AtaqueArqueiro = ataqueArqueiro;
    }

    public int getDefesaArqueiro() {
        return DefesaArqueiro;
    }

    public void setDefesaArqueiro(int defesaArqueiro) {
        DefesaArqueiro = defesaArqueiro;
    }

    public int getPvdArqueiro() {
        return PvdArqueiro;
    }

    public void setPvdArqueiro(int pvdArqueiro) {
        PvdArqueiro = pvdArqueiro;
    }

    void arqueiroStatus() { 
        System.out.format("O Arqueiro possue: %s de ataque, %d (pvd %d)\n", this.AtaqueArqueiro, this.DefesaArqueiro, this.PvdArqueiro);
    }

    void Acao(String Dragao){
        Scanner acao = new Scanner(System.in);
        System.out.println("1-Atacar, 2- Defesa, 3- Desistir");
        int e = acao.nextInt();
        switch(e){
            case 1 : {
                ArmaArqueiro();
            }
        }

    }

    void ArmaArqueiro(){
        int ArcoLongoDef = 12;
        int ArcoLongoAtk = 13;
        int BalestraDef = 15;
        int BalestraAtk = 10;

        Scanner arma = new Scanner (System.in);
        System.out.println("1 - ArcoLongo, 2- Balestra");
        int e = arma.nextInt();
        switch(e){
            case 1 : {
                System.out.println("Você atacou com o arco longo!");
                System.out.printf( "A vida do dragão é %s\n", (PvdDragao + DefesaDragao));
                System.out.format("O seu dano foi %s", (PvdDragao + DefesaDragao - ArcoLongoAtk + AtaqueArqueiro));

            }

            case 2 : {
                System.out.println(PvdDragao + DefesaDragao - BalestraAtk - AtaqueArqueiro);
            }
        }


    }
    
}
