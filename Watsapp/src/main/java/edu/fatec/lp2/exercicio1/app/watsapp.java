package edu.fatec.lp2.exercicio1.app;

import edu.fatec.lp2.exercicio1.model.*;
import edu.fatec.lp2.exercicio1.app.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class watsapp {
    public static void main(String[] args) {
        Wattsapp app = new Wattsapp();

        // Criar contatos
        Contatinho contato1 = new Contatinho("Ash", "12345-6789");
        Contatinho contato2 = new Contatinho("Misty", "98765-4321");

        // Adicionar contatos ao aplicativo
        app.addContato(contato1);
        app.addContato(contato2);

        // Criar e enviar mensagens
        Mensagem mensagem1 = new MsgTexto(contato1, "10:00", "Olá, Ash!");
        Mensagem mensagem2 = new MsgTexto(contato2, "10:05", "Oi, Misty!");

        app.enviarMensagem(mensagem1);
        app.enviarMensagem(mensagem2);

        // Listar contatos
        app.listarContatos();

        // Listar mensagens
        app.listarMensagens();
    }
}