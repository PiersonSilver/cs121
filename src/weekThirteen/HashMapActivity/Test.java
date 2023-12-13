package weekThirteen.HashMapActivity;

public class Test {
    public static void main(String[] args) {
        MashHap test = new MashHap();
        test.setPlayers("Kyrie Irving", "PG");
        test.setPlayers("J.R. Smith", "SG");
        test.setPlayers("Lebron James", "SF");
        test.setPlayers("Kevin Love", "PF");
        test.setPlayers("Tristan Thompson", "C");

        System.out.println(test.getPosition("Lebron James"));
        test.showPlayers();
        test.removePlayers("Kyrie Irving");
        test.showPlayers();
    }
}
