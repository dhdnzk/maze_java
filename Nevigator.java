package maze;

/**
 * Created by DH on 2015. 10. 13..
 */
public class Nevigator {
    
    static int whereToGo ( int[][] map, Node curPosition ) {
        if ( canGoRight( map, curPosition ) ) {
            return 1;
        }
        else if ( canGoDown( map, curPosition ) ) {
            return 2;
        }
        else if ( canGoLeft( map, curPosition ) ) {
            return 3;
        }
        else if ( canGoUP( map, curPosition ) ) {
            return 4;
        }
        else if ( canGoBack( map, curPosition ) ) {
            return 5;   // go back
        }
        else {
            return 6;   // game end
        }
    }

    static boolean canGoRight ( int[][] map, Node curPosition ) {

    }

    static boolean canGoDown ( int[][] map, Node curPosition ) {

    }

    static boolean canGoLeft ( int[][] map, Node curPosition ) {

    }

    static boolean canGoUP ( int[][] map, Node curPosition ) {

    }

    static boolean canGoBack ( int[][] map, Node curPosition ) {

    }

    boolean gameEndOrNot() {

        return true;
    }
}
