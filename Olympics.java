import java.util.*;
class Country {
    private String name;
    private String continent;
    private String ambassador;
    private List<Team> teams;

    public Country(String name, String continent, String ambassador) {
        this.name = name;
        this.continent = continent;
        this.ambassador = ambassador;
        this.teams = new ArrayList<Team>();
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public String getAmbassador() {
        return ambassador;
    }

    public List<Team> getTeams() {
        return teams;
    }
}

class Team {
    private String gameName;
    private int numPlayers;
    private List<Player> players;

    public Team(String gameName, int numPlayers) {
        this.gameName = gameName;
        this.numPlayers = numPlayers;
        this.players = new ArrayList<Player>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public String getGameName() {
        return gameName;
    }

    public int getNumPlayers() {
        return numPlayers;
    }

    public List<Player> getPlayers() {
        return players;
    }
}

class Player {
    private String name;
    private int id;
    private int age;
    private String sex;
    private String type;

    public Player(String name, int id, int age, String sex, String type) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.sex = sex;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getType() {
        return type;
    }
}
