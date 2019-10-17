import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * La classe Registrazione rappresenta una registrazione. Lo stato della classe consiste nei dati anagrafici dell'utente (nome, cognome, sesso)
 * e credenziali d'accesso (email, password), i cui valori sono stringhe inizialmente nulle.
 *
 * La classe permette di inserire i dati anagrafici e le credenziali d'accesso.
 *
 * @author Marco Borrelli
 *
 */
public class Registrazione {
    private String nome;
    private String cognome;
    private String sesso;
    private String email;
    private String password;
   
    public Registrazione() {
        this.cognome=null;
        this.nome=null;
        this.password=null;
        this.sesso=null;
        this.password=null;
    }
   
    public String getNome() {
        return nome;
    }
   
    /**
     * Inserisce il nome dell'utente
     * @param name: nome da inserire
     * @throws IllegalArgumentException: se si inserisce una stringa uguale a zero o maggiore di venti
     */
    public void inserisciNome(String name) throws IllegalArgumentException {
        if(name.length()==0)
            throw new IllegalArgumentException("Nome troppo breve ");
         if(name.length()>20)
             throw new IllegalArgumentException("Nome troppo lungo");
         
         this.nome=name;
    }
   
    public String getCognome() {
        return cognome;
    }
   
    /**
     * Inserisce il cognome dell'utente
     * @param surname: cognome da inserire
     * @throws IllegalArgumentException: se si inserisce una stringa uguale a zero o maggiore di venti
     */
    public void inserisciCognome(String cogn) throws IllegalArgumentException{
        if(cogn.length()==0)
            throw new IllegalArgumentException("Cognome troppo breve");
        if(cogn.length()>20)
            throw new IllegalArgumentException("Cognome troppo lungo");
        
        this.cognome=cogn;
    }
    public String getSesso() {
        return sesso;
    }
    
    /**
     * Inserisce il sesso dell'utente
     * @param ses: sesso da inserire
     * @throws IllegalArgumentException: se non si inserisce una stringa uguale alla stringa "maschio" o alla stringa "donna"
     */
    
    public void inserisciSesso(String sesso)  throws IllegalArgumentException {
        if(sesso.equals("Maschio") || sesso.equals("Femmina"))
        		this.sesso = sesso;
        else
        	throw new IllegalArgumentException("non hai selezionato il sesso");
        	
        
    }
   
    public String getEmail() {
        return email;
    }
   
    /**
     * Inserisce l'email dell'utente
     * @param em: email da inseire
     * @return: True quando l'email rispetta i parametri definiti, altrimenti False
     */
    
    public void setEmail(String em)  throws IllegalArgumentException {
    	
    	if(validateEmail(em) == true)
    		this.email=em;
    	else
        	throw new IllegalArgumentException("email non valida");

    }
    public boolean validateEmail(String em) {
    	
    	String emailReg="^[a-z.a-z+1-9]+@studenti.unisa.it";
    	Pattern emailPat= Pattern.compile(emailReg,Pattern.CASE_INSENSITIVE);
    	Matcher matcher= emailPat.matcher(em);
    	return matcher.find();
    	
    }
    public String getPassword() {
        return password;
    }
    
    /**
     * Inserisce la password dell'utente
     * @param pass: password da inserire
     * @throws IllegalArgumentException: se si inserisce una stringa uguale a 0 o maggiore di 8
     */
    
    public void inserisciPassword(String pass) throws IllegalArgumentException{
        if(pass.length()>8)
            throw new IllegalArgumentException("Password troppo lunga");
        if(pass.length()==0)
            throw new IllegalArgumentException("Password vuota");

        
        this.password=pass;
    }
   
   
}