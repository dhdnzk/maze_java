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
                go( Nevigator.whereToGo( this.map, this.curPosition ) );
                this.gameIng = Nevigator.game();
        }


        void go ( int i ) {
                switch ( i ) {
                        case 1:
                            break;

                        case 2:
                            break;

                        case 3:
                            break;

                        case 4:
                            break;

                        case 5:
                            break;

                }
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



