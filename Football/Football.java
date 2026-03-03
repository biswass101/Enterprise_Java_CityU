package Football;
abstract class FootballPlayer {
    protected String name;
    protected int goal;
    private double salary;

    FootballPlayer(String name, int goal) {
        this.name = name;
        this.goal = goal;
    }

    abstract double calculateGoalRate(int matchesPlayed);
    abstract String getLeague();

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void showDetails(double goalRate) {
        System.out.println("Name: " + name);
        System.out.println("League: " + getLeague());
        System.out.println("Goals: " + goal);
        System.out.println("Goal Rate: " + goalRate);
    }
}


class LaLigaPlayer extends FootballPlayer {

    LaLigaPlayer(String name, int goal) {
        super(name, goal);
    }

    @Override
    public String getLeague() {
        return "LaLiga";
    }

    @Override
    double calculateGoalRate(int matchesPlayed) {
        return goal / (double) matchesPlayed;
    }
}

class PremierLeaguePlayer extends FootballPlayer {

    PremierLeaguePlayer(String name, int goal) {
        super(name, goal);
    }

    @Override
    public String getLeague() {
        return "Premier League";
    }

    @Override
    double calculateGoalRate(int matchesPlayed) {
        return goal / (double) matchesPlayed;
    }
}


public class Football {
    public static void main(String[] args) {
        LaLigaPlayer messi = new LaLigaPlayer("Lionel Messi", 60);
        PremierLeaguePlayer ronaldo = new PremierLeaguePlayer("Cristiano Ronaldo", 50);

        messi.setSalary(50000);
        ronaldo.setSalary(45000);

        double messiGoalRate = messi.calculateGoalRate(30);
        double ronaldoGoalRate = ronaldo.calculateGoalRate(30);

        messi.showDetails(messiGoalRate);
        System.out.println("-----------------------------");
        ronaldo.showDetails(ronaldoGoalRate);
    }
}