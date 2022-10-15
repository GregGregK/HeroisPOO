import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        System.out.println("Seja bem vindo ao HEROES OF POO");
        System.out.println("Nessa jornada, você terá que derrotar o dragão que assombra a aldeia");
        System.out.println("INSERIR DRAGAO");
        System.out.println("Conheça seus aliados");

        Game status = new Game();
        status.EscolherPersonagem();
        status.Atacar();

        
    }
}
