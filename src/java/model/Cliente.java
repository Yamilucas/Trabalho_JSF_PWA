package model;

//import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String email;
    private String documento;
    private String  dataNascimento; //Não consegui mexer com LocalDates

    public Cliente() {
    }

    public Cliente(String nome, String email, String documento, String  dataNascimento) {
        this.nome = nome;
        this.email = email;
        this.documento = documento;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String  getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String  dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


}