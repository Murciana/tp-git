package application.domaine;

public class Tache {
	private int id;
	private String titre;
	private Etat etat;
	private String idUtilisateurAssigne;
	private String description;

	public Tache(int id, String titre, Etat etat, String idUtilisateurAssigne) {
		this.id = id;
		this.titre = titre;
		this.etat = etat;
		this.idUtilisateurAssigne = idUtilisateurAssigne;
	}

	public Tache(int id, String titre, Etat etat, String idUtilisateurAssigne, String description) {
		this.id = id;
		this.titre = titre;
		this.etat = etat;
		this.idUtilisateurAssigne = idUtilisateurAssigne;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(Etat etat) {
		this.etat = etat;
	}

	public String getIdUtilisateurAssigne() {
		return idUtilisateurAssigne;
	}

	public void setIdUtilisateurAssigne(String idUtilisateurAssigne) {
		this.idUtilisateurAssigne = idUtilisateurAssigne;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Tache{" +
				"id=" + id +
				", titre='" + titre + '\'' +
				", etat=" + etat +
				", idUtilisateurAssigne='" + idUtilisateurAssigne + '\'' +
				", description='" + description + '\'' +
				'}';
	}
}
