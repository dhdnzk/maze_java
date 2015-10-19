package maze;

/**
 * Created by DH on 2015. 10. 13..
 * Last modification 2015. 10. 15..
 */
public class MainTest {
    public static void main ( String[] args ) {
        maze.Player p1 = new Player();
        ScreenOut.showState( p1 );

        while(p1.gameIng) {
            p1.moving();
        }
        ScreenOut.showResult( p1 );
    }
}
