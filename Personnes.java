public class Personnes {

	public static void main(String[] args) {
		
		// On créer l'adresse
		//Adresse adresse1 = new Adresse("12 rue des rossignols", "11000", "Carcassonne");
		// On appelle le deuxième constructeur ( java le fait tout seul ! )
		Personne personne1 = new Personne("Durand", "Thomas", new Adresse("12 rue des rossignols", "11000", "Carcassonne"));
		
		// On va maintenant les associer
		//personne1.setAdresse(adresse1);
		javax.swing.JOptionPane.showMessageDialog(null, personne1);
	

	}

}
