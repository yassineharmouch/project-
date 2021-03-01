
public class Main {

	public static void main(String[] args) {
		String chaine ="de";
		TokenManager tm=new TokenManager(chaine);
		Parseur p=new Parseur (tm);
		
		if(p.valider())
			System.out.println(chaine + " est valide");
		else 
			System.out.println(chaine + " n'est valide");

	}

}
