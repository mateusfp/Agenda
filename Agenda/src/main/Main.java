
package main;

import Controller.agendaController;

public class Main {    
    public static void main(String[] args) {
        agendaController controller = new agendaController();

        controller.adicionar("Orlando", "999909409");
        controller.adicionar("Lucas", "999909410");
        controller.adicionar("Jose", "999909411");
        controller.adicionar("Valesca", "999909412");
        controller.adicionar("Luciano", "999909413");
        controller.adicionar("Abreu", "999909414");
        controller.mostrarAgenda();

        controller.totalContatos();

        controller.buscar("Abreu", "nome");
        controller.buscar("999909410", "numero");

        controller.remover("Orlando", "nome");
        controller.totalContatos();

        controller.remover("999909412", "numero");
        controller.totalContatos();

        controller.mostrarAgenda();
    }

}
