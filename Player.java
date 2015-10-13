package maze;

/**
 * Created by DH on 2015. 10. 13..
 * Last modification 2105. 10. 13..
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
                this.gameIng = go( Nevigator.whereToGo( this.map, this.curPosition ) );
        }

        boolean go ( int i ) {
                Node newNode;
                switch (i) {
                        case 1:
                                newNode = new Node (this.curPosition.getyPos(),
                                                    this.curPosition.getxPos() + 1,
                                                    this.curPosition );
                                this.curPosition.setState( 2 );
                                this.curPosition = newNode;
                                this.numOfMove++;

                                break;

                        case 2:
                                newNode = new Node (this.curPosition.getyPos() + 1,
                                                    this.curPosition.getxPos(),
                                                    this.curPosition );
                                this.curPosition.setState( 2 );
                                this.curPosition = newNode;
                                this.numOfMove++;
                                break;

                        case 3:
                                newNode = new Node (this.curPosition.getyPos(),
                                                    this.curPosition.getxPos() - 1,
                                                    this.curPosition );
                                this.curPosition.setState( 2 );
                                this.curPosition = newNode;
                                this.numOfMove++;
                                break;

                        case 4:
                                newNode = new Node (this.curPosition.getyPos() - 1,
                                                    this.curPosition.getxPos(),
                                                    this.curPosition );
                                this.curPosition.setState( 2 );
                                this.curPosition = newNode;
                                this.numOfMove++;
                                break;

                        case 5:
                                this.curPosition.setState( -1 );
                                this.curPosition.setNext( this.curPosition.getNext() );
                                this.numOfMove--;
                                break;

                        case 6:
                                return false;

                }
                return true;
        }
}
