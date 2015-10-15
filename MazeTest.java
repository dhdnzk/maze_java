package maze;

/**
 * Created by DH on 2015. 10. 13..
 * Last modification 2015. 10. 15..
 */
public class MazeTest {
    public static void main ( String[] args ) {
        Player p1 = new Player();
        ScreenOut.showState( p1 );

        while(p1.gameIng) {
            p1.move( );
        }
    }
}
