
package model;

public class contatoModelo {

    public String nome;
    public String numero;

    public contatoModelo(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "ContatoModel{" +
                "nome='" + nome + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
