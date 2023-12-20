public class Personne {
	// Attributs
	private String nom;
	private String prenom;
	private Adresse adresse;
	
	// Constructeurs
	public Personne(String nom, String prenom)
	{
		this.nom =  nom;
		this.prenom = prenom;
	}
	
	public Personne(String nom, String prenom, Adresse adresse)
	{
		this.nom =  nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "\nNom :" + nom + "\nPrenom :" + prenom  + adresse;
	}
	
	
}
