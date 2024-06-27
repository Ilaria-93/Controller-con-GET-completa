package co.develhope.controller_con_get_completa;

public class Name {
    public String nome;
    public String provincia;
    public String saluto;

    public Name(String nome, String provincia) {
        this.nome = nome;
        this.provincia = provincia;
        this.saluto = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
    }
}
