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

    public Utilisateur rechercherParId(String identifiant) throws RuntimeException {

        return utilisateurRepository.utilisateurs.stream()
                .filter(utilisateur -> utilisateur.getIdentifiant().equals(identifiant))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("cet utilisateur n'existe pas"));
    }

    public void modifierCourriel(String identifiant, String courriel) {

        Utilisateur utilisateur = rechercherParId(identifiant);
        utilisateur.setCourriel(courriel);
    }
	public void rechercherTous(){
		utilisateurRepository.utilisateurs.stream()
				.forEach(IO::println);
	}

}
