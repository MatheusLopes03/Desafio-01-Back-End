package src.model;

public abstract class Pessoa {

    //#region Attributes
    private String nome;
    private String cpf;
    private String telefone;
    private String sexo;
    private Endereco endereco;
    //#endregion 
    
    //#region Contructors
     public Pessoa(String nome, String cpf, String telefone, String sexo, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.sexo = sexo;
        this.endereco = endereco;
    }
    //#endregion

    //#region Getters and Setters 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    //#endregion

    //#region Methods
    public void seApresentar(){
        System.out.println("Prazer, meu nome é: " + nome);
    }
    //#endregion
}
