package application.services;

import application.domaine.Tache;
import application.repositories.TacheRepository;

import static application.domaine.Etat.NON_ASSIGNEE;

public class TacheService {

	private int compteurId = 11;
	private final TacheRepository tacheRepository;

	public TacheService() {
		tacheRepository = new TacheRepository();
	}

	public Tache creerTache(String titre, String description){
		int id = compteurId ++;
		return new Tache(id, titre, NON_ASSIGNEE, null, description);
	}

	public void rechercherParUtilisateur(String identifiantUtilisateur){
		tacheRepository.taches.stream()
				.filter(tache -> identifiantUtilisateur.equals(tache.getIdUtilisateurAssigne()))
				.forEach(tache -> IO.println("tâche trouvée: " + tache));

	}
}
