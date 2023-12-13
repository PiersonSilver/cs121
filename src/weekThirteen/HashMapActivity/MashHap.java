package weekThirteen.HashMapActivity;

import java.util.HashMap;

public class MashHap {
    private HashMap<String, String> players = new HashMap<>();
    public void setPlayers(String name, String position){
        players.put(name, position);
    }
    public void removePlayers(String name){
        players.remove(name);
    }
    public String getPosition(String name){
        return players.get(name);
    }
    public void showPlayers(){
        System.out.println(players.toString());
    }
}
