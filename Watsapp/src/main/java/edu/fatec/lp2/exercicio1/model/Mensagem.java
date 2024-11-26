package edu.fatec.lp2.exercicio1.model;

public abstract class Mensagem {

    private Contatinho destinatario;

    private String horaEnvio;

    private String conteudo;

    public Mensagem(Contatinho destinatario, String horaEnvio, String conteudo) {
        this.destinatario = destinatario;
        this.horaEnvio = horaEnvio;
        this.conteudo = conteudo;
    }

    public Contatinho getDestinatario() {
        return destinatario;
    }
    public String getConteudo() {
        return conteudo;
    }

    public String getHoraEnvio() {
        return horaEnvio;
    }
    public abstract Mensagem sendMessage(String conteudo);

    @Override
    public String toString() {
        return "Para: "+destinatario.getNome()+", Hora "+horaEnvio+", Conteudo "+conteudo;
    }

}
