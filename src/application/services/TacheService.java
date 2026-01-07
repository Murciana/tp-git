package application.services;

import application.domaine.Etat;
import application.domaine.Tache;
import application.domaine.Utilisateur;
import application.repositories.TacheRepository;
import application.repositories.UtilisateurRepository;

import static application.domaine.Etat.NON_ASSIGNEE;
import static application.domaine.Etat.TERMINEE;

public class TacheService {

	private int compteurId = 11;
	private final TacheRepository tacheRepository;

	public TacheService() {
		tacheRepository = new TacheRepository();
	}


	public void assigner(int id, String identifiant) {
		Tache tacheAAssigner = tacheRepository.taches.stream()
				.filter(tache -> tache.getId() == id)
				.findFirst()
				.orElseThrow(() -> new RuntimeException("Cette tache n'existe pas"));
		tacheAAssigner.setIdUtilisateurAssigne(identifiant);
		tacheAAssigner.setEtat(Etat.EN_COURS);
		IO.println(tacheAAssigner);
	}


	public Tache creerTache(String titre, String description){
		int id = compteurId ++;
		return new Tache(id, titre, NON_ASSIGNEE, null);
	}

		public void completerTache(int id){
			Tache tacheCompletee = tacheRepository.taches.stream()
					.filter(tache -> tache.getId()==id)
					.findFirst()
					.orElseThrow(()->new RuntimeException("Cette tache n'existe pas"));
			tacheCompletee.setEtat(TERMINEE);
			IO.println(tacheCompletee);
		}
}
