import java.util.Stack;

public class Parseur {
	private TokenManager tm;
	private Stack<Character> pile;
	private char tc;
	public Parseur(TokenManager tm) {
		
		this.tm = tm;
		pile=new Stack<>();
		pile.push('$');
		pile.push('S');
		avancer();
		
	} 
	
	private void avancer() {
	
		tc = tm.suivant();
		
	}
public boolean valider() {
	boolean termine=false;
	while(!termine) {
		System.out.println("sommet : " + pile.peek() +  " tc : "  +tc  );

		
		switch(pile.peek()) {
		case 'S' :
			if(tc=='b' || tc=='d' ) {
				
				pile.pop();
				pile.push('C');
				pile.push('B');
		
				
			}else if(tc=='c' || tc=='e' ) {
				
				pile.pop();
				pile.push('B');
				pile.push('C');
			
			}else 
				termine=true;
			break;
		case'B' :
			if(tc=='b') {
				
				avancer();
            }else if(tc=='d' ) {
				
				pile.pop();
				avancer();

			}else 
				termine=true;
			break;
		
		default :termine=true ;break;	
				
		}
		
	}
	
	return tc=='#' && pile.peek()== '$';
}

}
