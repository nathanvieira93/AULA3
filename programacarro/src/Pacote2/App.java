package Pacote2;

import Pacote3.Carro;

public class App {
    public static void main(String[] args) throws Exception {
        /* Limpa o terminal */
        System.out.print("\033[H\033[2J");
        System.out.flush();
        /* Limpa o terminal */
        
        Carro carro = new Carro();
        carro.placa = "ABC1234";
        carro.numChassi = 123456789;

        System.out.printf("Carro contém a placa %s e o número do chassi %d", carro.placa, carro.numChassi);
    }
}
