package es1_Persona;

/**
 * @author Francesco
 * Classe da istanziare per la creazione dell'oggetto persona
 * avente attributi private.
 */
public class PersonaPrivate {

    // variabili di ISTANZA
    private String nome;
    private String cognome;
    private String coloreCapelli;
    private Integer eta;

    // variabile di CLASSE con "static"
    // è vista contestualmente da tutti i metodi/oggetti a crearsi
    public static int nrPersoneCreate = 0;

    // dichiarazione dei COSTRUTTORI
    public PersonaPrivate() {

    }

    /**
     * Costruttore con soli 2 parametri
     * @param nome      Parametro Nome
     * @param cognome   Parametro Cognome
     */
    public PersonaPrivate(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        nrPersoneCreate++;
    }

    /**
     * Costruttore con 3 parametri
     * @param nome      Parametro Nome
     * @param cognome   Parametro Cognome
     * @param eta       Parametro eta
     */
    public PersonaPrivate(String nome, String cognome, Integer eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        nrPersoneCreate++;
    }

    /**
     * Costruttore con tutti e 4 i parametri
     * @param nome      Parametro Nome
     * @param cognome   Parametro Cognome
     * @param eta       Parametro eta
     * @param coloreCapelli Parametro Colore dei capelli
     */
    public PersonaPrivate(String nome, String cognome, String coloreCapelli, Integer eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.coloreCapelli = coloreCapelli;
        this.eta = eta;
        nrPersoneCreate++;
    }



    public String toString() {
        return "PersonaPrivate{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", coloreCapelli='" + coloreCapelli + '\'' +
                ", eta=" + eta +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getColoreCapelli() {
        return coloreCapelli;
    }

    public void setColoreCapelli(String coloreCapelli) {
        this.coloreCapelli = coloreCapelli;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }
}
