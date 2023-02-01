import java.util.*;
class Country {
    private String countryName;
    private String continent;
    private String ambassador;
    private List<Team> teams;
    public Country(String countryName, String continent, String ambassador) {
        this.countryName = countryName;
        this.continent = continent;
        this.ambassador = ambassador;
        teams = new ArrayList<Team>();
    }
    public String getCountryName() {
        return countryName;
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
    public void addTeam(Team team) {
        teams.add(team);
    }
}
class Team {
    private String gameName;
    private int playerCount;
    private List<Player> players;
    public Team(String gameName, int playerCount) {
        this.gameName = gameName;
        this.playerCount = playerCount;
        players = new ArrayList<Player>();
    }
    public String getGameName() {
        return gameName;
    }
    public int getPlayerCount() {
        return playerCount;
    }
    public List<Player> getPlayers() {
        return players;
    }
    public void addPlayer(Player player) {
        players.add(player);
    }
}
class Player {
    private String name;
    private int id;
    private int age;
    private String sex;
    private String playerType;
    public Player(String name, int id, int age, String sex, String playerType) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.sex = sex;
        this.playerType = playerType;
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
    public String getPlayerType() {
        return playerType;
    }
}
class Olympics {
    private int numberOfGames;
    private Map<String, Country> countries;
    public Olympics(int numberOfGames) {
        this.numberOfGames = numberOfGames;
        countries = new HashMap<String, Country>();
    }
    public int getNumberOfGames() {
        return numberOfGames;
    }
    public Map<String, Country> getCountries() {
        return countries;
    }
    public void addCountry(Country country) {
        countries.put(country.getCountryName(), country);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Olympics olympics = new Olympics(0);

        //Get number of games from user
        System.out.print("Enter number of games: ");
        olympics.numberOfGames = scan.nextInt();

        //Get country details from user
        System.out.print("Enter number of countries: ");
        int numCountries = scan.nextInt();
        for (int i = 0; i < numCountries; i++) {
            System.out.print("Enter country name: ");
            String countryName = scan.next();
            System.out.print("Enter continent: ");
            String continent = scan.next();
            System.out.print("Enter ambassador: ");
            String ambassador = scan.next();

            Country country = new Country(countryName, continent, ambassador);

            //Get team details for the country
            System.out.print("Enter number of teams for " + countryName + ": ");
            int numTeams = scan.nextInt();
            for (int j = 0; j < numTeams; j++) {
                System.out.print("Enter game name: ");
                String gameName = scan.next();
                System.out.print("Enter player count: ");
                int playerCount = scan.nextInt();

                Team team = new Team(gameName, playerCount);

                //Get player details for the team
                for (int k = 0; k < playerCount; k++) {
                    System.out.print("Enter player name: ");
                    String playerName = scan.next();
                    System.out.print("Enter player id: ");
                    int playerId = scan.nextInt();
                    System.out.print("Enter player age: ");
                    int playerAge = scan.nextInt();
                    System.out.print("Enter player sex: ");
                    String playerSex = scan.next();
                    System.out.print("Enter player type (Main player or substitute player): ");
                    String playerType = scan.next();

                    Player player = new Player(playerName, playerId, playerAge, playerSex, playerType);
                    team.addPlayer(player);
                }
                country.addTeam(team);
            }
            olympics.addCountry(country);
        }
        System.out.println("Olympics details:");
        System.out.println("Number of games: " + olympics.getNumberOfGames());
        System.out.println("Countries: ");
        for (Map.Entry<String, Country> entry : olympics.getCountries().entrySet()) {
            Country country = entry.getValue();
            System.out.println("\tCountry: " + country.getCountryName());
            System.out.println("\tContinent: " + country.getContinent());
            System.out.println("\tAmbassador: " + country.getAmbassador());
            System.out.println("\tTeams: ");
            for (Team team : country.getTeams()) {
                System.out.println("\t\tGame: " + team.getGameName());
                System.out.println("\t\tPlayer count: " + team.getPlayerCount());
                System.out.println("\t\tPlayers: ");
                for (Player player : team.getPlayers()) {
                    System.out.println("\t\t\tName: " + player.getName());
                    System.out.println("\t\t\tId: " + player.getId());
                    System.out.println("\t\t\tAge: " + player.getAge());
                    System.out.println("\t\t\tSex: " + player.getSex());
                    System.out.println("\t\t\tType: " + player.getPlayerType());
                }
            }
        }
        scan.close();
    }
}
