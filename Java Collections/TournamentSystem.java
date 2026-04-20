import java.util.*;

// Player Class
class Player {
    int playerId;
    String name;

    public Player(int playerId, String name) {
        this.playerId = playerId;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Player)) return false;
        Player p = (Player) obj;
        return this.playerId == p.playerId;
    }

    @Override
    public String toString() {
        return playerId + " - " + name;
    }
}

// Match Class
class Match {
    int matchId;
    Player p1, p2;

    public Match(int matchId, Player p1, Player p2) {
        this.matchId = matchId;
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Match " + matchId + ": " + p1.name + " vs " + p2.name;
    }
}

// Result Class
class Result {
    Match match;
    Player winner;

    public Result(Match match, Player winner) {
        this.match = match;
        this.winner = winner;
    }

    @Override
    public String toString() {
        return match + " | Winner: " + winner.name;
    }
}

// Score Class (for ranking)
class Score implements Comparable<Score> {
    Player player;
    int points;

    public Score(Player player, int points) {
        this.player = player;
        this.points = points;
    }

    // Sort descending by score
    @Override
    public int compareTo(Score other) {
        return other.points - this.points;
    }

    @Override
    public String toString() {
        return player.name + " - " + points + " pts";
    }
}

// Main System
public class TournamentSystem {
    public static void main(String[] args) {

        // 1. Register players (Set)
        Set<Player> players = new HashSet<>();
        Player p1 = new Player(1, "Amit");
        Player p2 = new Player(2, "Ravi");
        Player p3 = new Player(3, "Neha");

        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p1); // duplicate ignored

        System.out.println("Registered Players:");
        for (Player p : players) {
            System.out.println(p);
        }

        // 2. Match Queue
        Queue<Match> matchQueue = new LinkedList<>();
        matchQueue.add(new Match(1, p1, p2));
        matchQueue.add(new Match(2, p2, p3));

        // 3. Results List
        List<Result> results = new ArrayList<>();

        // 4. Leaderboard (TreeSet)
        TreeSet<Score> leaderboard = new TreeSet<>();

        System.out.println("\nProcessing Matches:");

        while (!matchQueue.isEmpty()) {
            Match match = matchQueue.poll();
            System.out.println("Playing: " + match);

            // Simulate winner (p1 always wins here)
            Player winner = match.p1;

            results.add(new Result(match, winner));

            // Add score (10 points per win)
            leaderboard.add(new Score(winner, 10));
        }

        // Display Results
        System.out.println("\nMatch Results:");
        for (Result r : results) {
            System.out.println(r);
        }

        // Display Leaderboard
        System.out.println("\nLeaderboard:");
        for (Score s : leaderboard) {
            System.out.println(s);
        }
    }
}