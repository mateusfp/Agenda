
package Service;

import java.util.ArrayList;
import model.contatoModelo;

public class agendaService {
    ArrayList<contatoModelo> listaContatos = new ArrayList<>();

    public boolean addContato(String nome, String numero){
        contatoModelo contatoModel = new contatoModelo(nome, numero);
        try {
            listaContatos.add(contatoModel);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    public boolean removeContatoNumero(String numero){
        try {
            listaContatos.removeIf(contato -> contato.numero.equals(numero));
            return true;
        }catch (Exception e){
            System.err.print(e);
            return false;
        }
    }

    public boolean removeContatoNome(String nome){
        try {
            listaContatos.removeIf(contato -> contato.nome.equals(nome));
            return true;
        }catch (Exception e){
            System.err.print(e);
            return false;
        }
    }

    public int total(){
        return listaContatos.size();
    }

    public String buscarContatoNome(String nome){
        for (contatoModelo contato: listaContatos) {
            if(contato.nome.equals(nome)){
                return contato.numero;
            }
        }
        return "Nenhum contato com esse nome";
    }

    public String buscarContatoNumero(String numero){
        for (contatoModelo contato: listaContatos) {
            if(contato.numero.equals(numero)){
                return contato.nome;
            }
        }

        return "Nenhum contato com esse numero";
    }
    
    public void Agenda(String nome){
        System.out.println("\nNome: "+nome
                +"\n\n");
    }

    public void mostrar(){
        listaContatos.forEach(System.out::println);
    }    
}
