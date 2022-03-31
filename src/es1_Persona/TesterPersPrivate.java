package es1_Persona;

/**
 * @author Francesco
 * Programma che stamperà a cli il contenuto degli oggetti persona valorizzati in hardcode
 */
public class TesterPersPrivate {
    /**
     * metodo main di avvio
     * @param args
     */
    public static void main(String[] args) {
        //istanzio un oggetto di tipo persona, tramite una VARIABILE DI ISTANZA
        PersonaPrivate cico = new PersonaPrivate();
        System.out.println(cico);

        System.out.println();

        PersonaPrivate ciccioIngrassia = new PersonaPrivate("Ciccio", "Ingrassia", "marrone", 55);
        System.out.println(ciccioIngrassia);

        PersonaPrivate francoFranchi = new PersonaPrivate("Franco", "Franchi", 50);
        System.out.println(francoFranchi);

        // caso di variabili dichiarate pubbliche nella Classe del costruttore
        // dichiarare sempre oggetto
        // Persona ciccio = new Persona();
        // possibilità di assegnare attributi..  NON SI FA!
        // ciccio.nome = "Ciccio";
    }
}
