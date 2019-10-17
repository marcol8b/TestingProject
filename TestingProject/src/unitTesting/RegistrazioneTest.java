package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import registrazione.Registrazione;

class RegistrazioneTest {

	Registrazione acc;
	
	  @BeforeEach                      			  // Prima di ogni @Test
	    public void setAccount(){
	        acc = new Registrazione();
	    }
	
	
	@Test
	
	public void testNomeOK() {
		
		acc.inserisciNome("Marco");
		assertEquals(acc.getNome(),"Marco");
	}
	
	@Test
	
	public void testNomebreveFAIL() {
		
			String message="Nome troppo breve";
		  IllegalArgumentException exceptionThrown= assertThrows(IllegalArgumentException.class, ()-> 
		  {acc.inserisciNome(""); });
		  
		  assertEquals(message,exceptionThrown.getMessage());
	}
	

	@Test
	
	public void testNomelungoFAIL() {
		
			String message="Nome troppo lungo";
		  IllegalArgumentException exceptionThrown= assertThrows(IllegalArgumentException.class, ()-> 
		  {acc.inserisciNome("Marcomarcomarcomarcom"); });
		  
		  assertEquals(message,exceptionThrown.getMessage());
	}
	
@Test
	
	public void testCognomeOK() {
		
		acc.inserisciCognome("Borrelli");
		assertEquals(acc.getCognome(),"Borrelli");
	}
	
	@Test
	
	public void testCognomebreveFAIL() {
		
			String message="Cognome troppo breve";
		  IllegalArgumentException exceptionThrown= assertThrows(IllegalArgumentException.class, ()-> 
		  {acc.inserisciCognome(""); });
		  
		  assertEquals(message,exceptionThrown.getMessage());
	}
	

	@Test
	
	public void testCognomelungoFAIL() {
		
			String message="Cognome troppo lungo";
		  IllegalArgumentException exceptionThrown= assertThrows(IllegalArgumentException.class, ()-> 
		  {acc.inserisciCognome("Marcomarcomarcomarcom"); });
		  
		  assertEquals(message,exceptionThrown.getMessage());
	}

	@Test
	
	public void testSessoOK() {
		
			acc.inserisciSesso("Maschio");
			assertEquals(acc.getSesso(),"Maschio");
	}

	
	@Test
	
	public void testSessoFAIL() {
		
			String message="non hai selezionato il sesso";
		  IllegalArgumentException exceptionThrown= assertThrows(IllegalArgumentException.class, ()-> 
		  {acc.inserisciSesso("sesso"); });
		  
		  assertEquals(message,exceptionThrown.getMessage());
	}
	
	@Test
	
	public void testEmailOK() {
		
		acc.inserisciEmail("m.borrelli18@studenti.unisa.it");
		assertEquals(acc.getEmail(),"m.borrelli18@studenti.unisa.it");
	}
	
	@Test
	public void testEmailFAIL() {
		
		String message="email non valida";
	  IllegalArgumentException exceptionThrown= assertThrows(IllegalArgumentException.class, ()-> 
	  {acc.inserisciEmail("m.borrelli18@live.it"); });
	  
	  assertEquals(message,exceptionThrown.getMessage());
	}
	
	@Test
	
	public void testPassOK() {
		
		acc.inserisciPassword("Marco977");
		assertEquals(acc.getPassword(),"Marco977");
	}
	
	@Test
	public void testPasslungaFAIL() {
		
		String message="Password troppo lunga";
	  IllegalArgumentException exceptionThrown= assertThrows(IllegalArgumentException.class, ()-> 
	  {acc.inserisciPassword("Marco9777"); });
	  
	  assertEquals(message,exceptionThrown.getMessage());
	}
	
	@Test
	public void testPassvuotaFAIL() {
		
		String message="Password vuota";
	  IllegalArgumentException exceptionThrown= assertThrows(IllegalArgumentException.class, ()-> 
	  {acc.inserisciPassword(""); });
	  
	  assertEquals(message,exceptionThrown.getMessage());
	}
	
	@Test
	public void testPassripOK() {
		
		acc.inserisciPassword("Marco977");
		acc.inserisciPassRip("Marco977");
		
		assertEquals(acc.getPassrip(),"Marco977");
	}
	
	@Test
	public void testPassripFAIL() {
		
		String message="La password non corrisponde";
	  IllegalArgumentException exceptionThrown= assertThrows(IllegalArgumentException.class, ()-> 
	  {acc.inserisciPassword("Marco977"); acc.inserisciPassRip("Ma"); });
	  
	  assertEquals(message,exceptionThrown.getMessage());
	}
	
}
