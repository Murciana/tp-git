import application.domaine.Tache;
import application.domaine.Utilisateur;
import application.repositories.UtilisateurRepository;
import application.services.TacheService;
import application.services.UtilisateurService;

void main() {
//    List<Utilisateur> listeUtilisateurs = new ArrayList<>();
//    List<Tache> listeTaches = new ArrayList<>();

    UtilisateurRepository utilisateurRepository = new UtilisateurRepository();

    TacheService taches = new TacheService();
    UtilisateurService utilisateurs = new UtilisateurService();

    //Placez vos appels de méthodes ici
    utilisateurRepository.utilisateurs.add(utilisateurs.creerUtilisateur("Murciana", "Lebouedec"));
    utilisateurRepository.utilisateurs.forEach(IO::println);

    IO.println(utilisateurs.rechercherParId("jdupont"));
    utilisateurs.modifierCourriel("jdupont", "jojo.dupont@mail.com");
    IO.println(utilisateurs.rechercherParId("jdupont"));
}