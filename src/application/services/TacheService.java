package application.services;

import application.domaine.Etat;
import application.domaine.Tache;
import application.domaine.Utilisateur;
import application.repositories.TacheRepository;
import application.repositories.UtilisateurRepository;

public class TacheService {

	private int compteurId = 11;
	private final TacheRepository tacheRepository;

	public TacheService() {
		tacheRepository = new TacheRepository();
	}


	public void assigner(int id, String identifiant){
		Tache tacheAAssigner = tacheRepository.taches.stream()
				.filter(tache -> tache.getId()==id)
				.findFirst()
				.orElseThrow(()->new RuntimeException("Cette tache n'existe pas"));
		tacheAAssigner.setIdUtilisateurAssigne(identifiant);
		tacheAAssigner.setEtat(Etat.EN_COURS);
		IO.println(tacheAAssigner);


	}
}
