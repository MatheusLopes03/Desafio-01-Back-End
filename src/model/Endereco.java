package src.model;

public class Endereco {

    //#region Attributes
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String complemento;
    //#endregion

    //#region Constructors
    public Endereco(String rua, int numero, String bairro, String cidade, String complemento) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.complemento = complemento;
    }
    //#endregion

    //#region Getters and Setters
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    //#endregion
    
}
