package application.services;

import application.domaine.Utilisateur;
import application.repositories.UtilisateurRepository;

public class UtilisateurService {

	private final UtilisateurRepository utilisateurRepository;

	public UtilisateurService() {
		utilisateurRepository = new UtilisateurRepository();
	}


	public void rechercherParId(String identifiant) {

		utilisateurRepository.utilisateurs.stream()
				.filter(utilisateur -> utilisateur.getIdentifiant().equals(identifiant))
				.forEach(IO::println);
	}

}
