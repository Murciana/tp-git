import application.domaine.Tache;
import application.domaine.Utilisateur;
import application.repositories.TacheRepository;
import application.repositories.UtilisateurRepository;
import application.services.TacheService;
import application.services.UtilisateurService;

void main() {
//    List<Utilisateur> listeUtilisateurs = new ArrayList<>();
//    List<Tache> listeTaches = new ArrayList<>();

    UtilisateurRepository utilisateurRepository = new UtilisateurRepository();
    TacheRepository tacheRepository = new TacheRepository();

    TacheService taches = new TacheService();
    UtilisateurService utilisateurs = new UtilisateurService();

    //Placez vos appels de méthodes ici
    utilisateurRepository.utilisateurs.add(utilisateurs.creerUtilisateur("Murciana", "Lebouedec"));
    utilisateurRepository.utilisateurs.forEach(IO::println);
  
    utilisateurs.rechercherTous();
  
    IO.println(utilisateurs.rechercherParId("jdupont"));
    utilisateurs.modifierCourriel("jdupont", "jojo.dupont@mail.com");
    IO.println(utilisateurs.rechercherParId("jdupont"));

    tacheRepository.taches.add(taches.creerTache("Tache1", "manger"));
    tacheRepository.taches.forEach(IO::println);

    taches.rechercherParUtilisateur("tmartin");
}