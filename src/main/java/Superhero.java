public class Superhero {
    private String pseudonym;
    private String fullName;
    private String gender;
    private String race;
    private String team;

    public Superhero(String pseudonym, String fullName, String gender, String race, String team) {
        this.pseudonym = pseudonym;
        this.fullName = fullName;
        this.gender = gender;
        this.race = race;
        this.team = team;
    }

    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
