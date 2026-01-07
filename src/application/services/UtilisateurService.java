package application.services;

import application.domaine.Utilisateur;
import application.repositories.UtilisateurRepository;

public class UtilisateurService {

	private final UtilisateurRepository utilisateurRepository;

	public UtilisateurService() {
		utilisateurRepository = new UtilisateurRepository();
	}

	public Utilisateur creerUtilisateur(String prenom, String nom) {
		String identifiant = (prenom.charAt(0) + nom).toLowerCase();
		String courriel = (prenom + "." + nom + "@mail.com").toLowerCase();

		return new Utilisateur(identifiant, nom, prenom, courriel);

	}

	public UtilisateurRepository getUtilisateurRepository() {
		return utilisateurRepository;
	}
}
