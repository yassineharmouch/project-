
public class TokenManager {
	private String entree;
	private int courant=0;
	public TokenManager(String entree) {
		
		this.entree = entree;
		
	}
	
	public char suivant () {
		if ( courant < entree.length() )
			return entree.charAt(courant++);
		else
			return '#'; 
	}

}
