package ohtuesimerkki;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class StatisticsTest {

    Statistics stats;
    Reader readerStub = new Reader() {

        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();

            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));

            return players;
        }
    };

    @Before
    public void setUp() {
        stats = new Statistics(readerStub);
    }

    @Test
    public void searchReturnsCorrectPlayer(){
        Player player = stats.search("Yzerman");
        assertEquals("Yzerman", player.getName());
        assertEquals("DET", player.getTeam());
        assertEquals(42, player.getGoals());
        assertEquals(56, player.getAssists());
    }

    @Test
    public void searchWorksWhenNothingIsFound(){
        assertEquals(null, stats.search("-"));
    }

    @Test
    public void teamReturnsCorrectTeamMembers(){
        Player player = stats.team("PIT").get(0);

        assertEquals("Lemieux", player.getName());
        assertEquals("PIT", player.getTeam());
        assertEquals(45, player.getGoals());
        assertEquals(54, player.getAssists());
    }

    @Test
    public void topScorersWorks(){
        Player player = stats.topScorers(1).get(0);

        assertEquals("Gretzky", player.getName());
        assertEquals("EDM", player.getTeam());
        assertEquals(35, player.getGoals());
        assertEquals(89, player.getAssists());
    }
}