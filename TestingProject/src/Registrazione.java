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
    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public void inserisciNome(String name) throws IllegalArgumentException {
        if(nome.length()==0)
            throw new IllegalArgumentException("Nome troppo breve ");
         if(nome.length()>20)
             throw new IllegalArgumentException("Nome troppo lungo");
         
         this.nome=name;
    }
   
    public String getCognome() {
        return cognome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
   
    public void inserisciCognome(String cogn) throws IllegalArgumentException{
        if(cognome.length()==0)
            throw new IllegalArgumentException("Cognome troppo breve");
        if(cognome.length()>20)
            throw new IllegalArgumentException("Cognome troppo lungo");
        
        this.cognome=cogn;
    }
    public String getSesso() {
        return sesso;
    }
    public void setSesso(String sesso) {
        this.sesso = sesso;
    }
   
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
   
    public void inserisciPassword(String pass) throws IllegalArgumentException{
        if(password.length()==0)
            throw new IllegalArgumentException("Password troppo breve");
        if( password.length()>20)
            throw new IllegalArgumentException("Password troppo lunga");
        
        this.password=pass;
    }
   
   
}