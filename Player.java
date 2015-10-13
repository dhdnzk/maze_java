package maze;

/**
 * Created by DH on 2015. 10. 13..
 */
public class Player {
        private int numOfMove;
        public boolean gameIng;
        private Node curPosition;
        private int[][] map = {
                {0, 0, 0, 1, 1, 0, 1, 1, 1, 1},
                {1, 1, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 0, 1, 1, 0},
                {0, 1, 1, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 1, 0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1, 0, 1, 1, 1, 0},
                {0, 0, 0, 0, 1, 0, 1, 0, 0, 0},
                {0, 1, 1, 1, 1, 0, 1, 0, 1, 1},
                {0, 0, 0, 0, 0, 0, 1, 0, 0, 0}
        };

        Player() {
                curPosition = new Node( -1, -1 );
                this.numOfMove = 0;
                this.gameIng = true;
        }

        void move ( ) {
                go( this.whereToGo() );
                this.gameEndOrNot();
        }

        int whereToGo ( ) {
                if ( this.canGoRight() ) {
                        return 1;
                }
                else if ( this.canGoDown() ) {
                        return 2;
                }
                else if ( this.canGoLeft() ) {
                        return 3;
                }
                else if ( this.canGoUP() ) {
                        return 4;
                }
                else {
                        return 5;
                }

        }

        boolean canGoRight () {

        }

        boolean canGoDown () {

        }

        boolean canGoLeft () {

        }

        boolean canGoUP () {

        }

        void go (int i) {

        }

        void gameEndOrNot() {

        }
}

class Node {
        private int xPos;
        private int yPos;
        private Node next;

        Node ( int xPos, int yPos ) {
                this( xPos, yPos, null );
        }

        Node ( int xPos, int yPos, Node next ) {
                this.xPos = xPos;
                this.yPos = yPos;
                this.next = next;
        }

        void setNext(Node next) {
                this.next = next;
        }
}



