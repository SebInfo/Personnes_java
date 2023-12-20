public class Adresse {
	
	// Attributs
	private String rue;
	private String codePostal;
	private String ville;
	
	// Constructeur
	public Adresse(String rue, String codePostal, String ville)
	{
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	public String getRue() {
		return rue;
	}


	public String getCodePostal() {
		return codePostal;
	}


	public String getVille() {
		return ville;
	}

	@Override
	public String toString() {
		return "\n" + rue + "\n" + codePostal + " " + ville;
	}

	
}
