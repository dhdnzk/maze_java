package maze;

/**
 * Created by DH on 2015. 10. 13..
 * Last modification 2015. 10. 13..
 *
 */
public class Nevigator {

    static int whereToGo ( int[][] map, Node curPosition ) {
        if ( canGoRight(map, curPosition) ) {
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
            return 5;
        }
        else {
            return 6;   // game end
        }
    }

    static boolean canGoRight ( int[][] map, Node curPosition ) {
        try {
            if (map[curPosition.getyPos()][curPosition.getxPos() + 1] == 0)
                return true;
            else
                return false;
        }catch ( ArrayIndexOutOfBoundsException e ) {
            e.getMessage();
            return false;
        }
    }

    static boolean canGoDown ( int[][] map, Node curPosition ) {
        try {
            if (map[curPosition.getyPos() + 1][curPosition.getxPos()] == 0)
                return true;
            else
                return false;
        } catch ( ArrayIndexOutOfBoundsException e ) {
            e.getMessage();
            return false;
        }
    }

    static boolean canGoLeft ( int[][] map, Node curPosition ) {
        try {
            if (map[curPosition.getyPos()][curPosition.getxPos() - 1] == 0)
                return true;
            else
                return false;
        } catch ( ArrayIndexOutOfBoundsException e ) {
            e.getMessage();
            return false;
        }
    }

    static boolean canGoUP ( int[][] map, Node curPosition ) {
        try {
            if (map[curPosition.getyPos()][curPosition.getxPos()] == 0)
                return true;
            else
                return false;
        } catch ( ArrayIndexOutOfBoundsException e ) {
            return false;
        }
    }

    static boolean canGoBack ( int[][] map, Node curPosition ) {
        try {
            if (map[curPosition.getyPos()][curPosition.getxPos() + 1] == 2)
                return true;
            else if (map[curPosition.getyPos()][curPosition.getxPos() - 1] == 2)
                return true;
            else if (map[curPosition.getyPos() + 1][curPosition.getxPos()] == 2)
                return true;
            else if (map[curPosition.getyPos() - 1][curPosition.getxPos()] == 2)
                return true;
            else
                return false;
        } catch ( ArrayIndexOutOfBoundsException e ) {
            e.getMessage();
            return false;
        }
    }
}
