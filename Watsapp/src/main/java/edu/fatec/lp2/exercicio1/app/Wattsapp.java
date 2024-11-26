package edu.fatec.lp2.exercicio1.app;

import edu.fatec.lp2.exercicio1.model.*;
import java.util.ArrayList;

public class Wattsapp {
    private ArrayList<Contatinho> contatos;
    private ArrayList<Mensagem> mensagens;

    public Wattsapp() {
        this.contatos = new ArrayList<>();
        this.mensagens = new ArrayList<>();
    }

    // Método para adicionar um contato
    public void addContato(Contatinho contato) {
        contatos.add(contato);
    }

    // Método para enviar uma mensagem
    public void enviarMensagem(Mensagem mensagem) {
        mensagens.add(mensagem);
    }

    // Método para listar contatos
    public void listarContatos() {
        System.out.println("Contatos:");
        for (Contatinho contato : contatos) {
            System.out.println("- " + contato.getNome() + " (" + contato.getCelular() + ")");
        }
    }

    // Método para listar mensagens
    public void listarMensagens() {
        System.out.println("Mensagens:");
        for (Mensagem mensagem : mensagens) {
            System.out.println(mensagem);
        }
    }
}
