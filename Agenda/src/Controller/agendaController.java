
package Controller;

import Service.agendaService;

public class agendaController {    

    agendaService agendaService = new agendaService();

    boolean isValid(String value, int minLen){
        return value.length() >= minLen;
    }

    public void adicionar(String nome, String numero){
        if (isValid(nome, 1) && isValid(numero, 9)){
            agendaService.addContato(nome, numero);
        }else{
            System.out.println("Os dados estão invalidos:\n" +
                    "O seu nome precisa ter 1 ou mais caracteres e" +
                    "o seu numero precisa ter no minimo 9 ou mais caracteres");
        }
    }

    /** remover por token: "nome" ou "numero" */
    public void remover(String value, String token){
        switch (token.toLowerCase()){
            case "nome":
                agendaService.removeContatoNome(value);
                break;
            case "numero":
                agendaService.removeContatoNumero(value);
                break;
            default:
                break;
        }
    }

    /** buscar por token: "nome" ou "numero" */
    public void buscar(String value, String token){
        switch (token.toLowerCase()){
            case "nome":
                System.out.println(agendaService.buscarContatoNome(value));
                break;
            case "numero":
                System.out.println(agendaService.buscarContatoNumero(value));
                break;
            default:
                break;
        }
    }

    public void mostrarAgenda(){
        agendaService.mostrar();
    }

    public void totalContatos(){
        System.out.println("Total de contatos:" + agendaService.total());
    }
}
