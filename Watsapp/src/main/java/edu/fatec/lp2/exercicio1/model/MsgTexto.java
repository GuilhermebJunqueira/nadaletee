package edu.fatec.lp2.exercicio1.model;

public class MsgTexto extends Mensagem {
    private int numChar;


    public MsgTexto(Contatinho destinatario, String horaEnvio, String conteudo) {
        super(destinatario, horaEnvio, conteudo);
        this.numChar = conteudo.length();
    }

    @Override
    public Mensagem sendMessage(String conteudo){
        return new MsgTexto(this.getDestinatario(),this.getHoraEnvio(),conteudo);
    }

}
