package maze;

/**
 * Created by DH on 2015. 10. 13..
 * Last modification 2105. 10. 15..
 */
public class Player {
        private int numOfMove;
        public boolean gameIng;
        private Node curPosition;
/*       0 : 아직 안간곳
         1 : 벽
         2 : 지나온 길
         3 : 갔다가 아니어서 돌아온길
         4 : 출발지점
         5 : 도착지점
*/
//private int[][] map = {
//        {4, 1, 0, 0, 0, 0, 1, 1, 1, 1},
//        {0, 1, 1, 0, 1, 0, 0, 0, 0, 0},
//        {0, 0, 0, 0, 1, 1, 0, 1, 1, 0},
//        {0, 1, 1, 1, 0, 0, 0, 1, 0, 0},
//        {0, 0, 0, 0, 1, 1, 1, 1, 1, 1},
//        {1, 1, 1, 0, 1, 0, 0, 0, 0, 0},
//        {1, 0, 1, 0, 1, 0, 1, 1, 1, 0},
//        {0, 0, 0, 0, 1, 0, 1, 0, 0, 0},
//        {0, 1, 1, 1, 1, 0, 1, 0, 1, 1},
//        {0, 0, 0, 0, 0, 0, 1, 0, 0, 5}
//        };


        private int[][] map = {
                {4,1,1,0,0,0,0,1,1,1,1,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,1},
                {0,0,0,0,1,1,1,1,1,0,0,0,0,1,0,0,0,1,0,1,1,1,0,1,0,0,0,1,0,1},
                {0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,1},
                {0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,1,1,1,1,1,1,1,0,1},
                {0,0,0,0,0,1,1,0,1,1,1,1,0,1,1,1,1,1,1,1,0,1,0,0,0,0,0,0,0,1},
                {0,1,1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,0,1,1,1,0,1},
                {0,1,1,1,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,0,0,1},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,1,1,0,1,0,1,0,0},
                {0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,1,0,0,1,1,1,0,1},
                {1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,0,1,0,0,0,0,0,1,1,0,0,0,1,1,1},
                {1,1,1,0,1,0,1,0,0,0,0,0,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1},
                {0,0,0,0,1,0,1,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,0,1},
                {0,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,0,1,0,1},
                {0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,1,1,0,1,1,1,0,1,0,1,1,0,1,0,1},
                {1,1,1,0,1,0,1,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,0,0,0,0,1,0,1},
                {0,0,0,0,1,0,1,0,1,1,1,1,1,1,0,1,1,0,1,0,1,0,1,0,1,1,0,1,0,1},
                {0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,0,1,0,1,0,1,0,1,1,0,1,0,1},
                {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,0,0,1,0,1},
                {0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,0,0,1,1,0,1},
                {0,1,0,0,0,0,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,0,0,1,1,0,0,1},
                {0,1,1,1,1,1,1,1,0,1,1,0,1,1,0,0,0,0,0,1,0,1,0,0,1,1,0,0,1,1},
                {0,1,0,0,0,0,0,1,0,0,0,0,1,1,0,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1},
                {0,1,1,1,1,1,0,1,0,1,1,0,1,1,0,0,0,0,0,0,0,1,1,1,1,0,0,0,0,0},
                {0,0,0,0,1,1,0,1,0,1,1,0,1,1,0,1,0,1,1,1,1,1,1,1,1,0,1,1,1,0},
                {1,1,1,0,1,1,0,1,0,1,1,0,1,1,0,1,0,0,0,0,0,0,0,0,0,0,1,0,1,0},
                {1,0,1,0,1,0,0,0,1,1,1,0,1,1,0,1,0,1,1,0,1,1,1,1,1,1,1,1,0,0},
                {1,0,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,1,1,0,1,1,0,1},
                {1,0,1,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,1},
                {1,0,1,0,1,1,1,0,1,0,1,1,0,1,1,0,1,1,1,1,1,1,1,1,0,1,1,1,1,0},
                {1,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,5}
        };







        Player() {
                curPosition = new Node( 0, 0 );
                this.numOfMove = 0;
                this.gameIng = true;
        }

        void move ( ) {
                this.gameIng = go( Nevigator.whereToGo( this.map, this.curPosition ) );
                this.gameIng = Nevigator.gameOverOrNot( this.map, this.curPosition );
                ScreenOut.showState( this );
        }

        boolean go ( int i ) {
                if ( this.map[curPosition.getyPos()][curPosition.getxPos()] != 4 &&
                        this.map[curPosition.getyPos()][curPosition.getxPos()] != 5 ) {
                        this.map[curPosition.getyPos()][curPosition.getxPos()] = 2;
                }
                Node newNode;
                switch (i) {
                        case 1:
                                newNode = new Node (this.curPosition.getxPos() + 1,
                                                    this.curPosition.getyPos(),
                                                    this.curPosition );
                                this.curPosition.setState( 2 );
                                this.curPosition = newNode;
                                this.numOfMove++;

                                break;

                        case 2:
                                newNode = new Node (this.curPosition.getxPos(),
                                                    this.curPosition.getyPos() + 1,
                                                    this.curPosition );
                                this.curPosition.setState( 2 );
                                this.curPosition = newNode;
                                this.numOfMove++;
                                break;

                        case 3:
                                newNode = new Node (this.curPosition.getxPos() - 1,
                                                    this.curPosition.getyPos(),
                                                    this.curPosition );
                                this.curPosition.setState( 2 );
                                this.curPosition = newNode;
                                this.numOfMove++;
                                break;

                        case 4:
                                newNode = new Node (this.curPosition.getxPos(),
                                                    this.curPosition.getyPos() - 1,
                                                    this.curPosition );
                                this.curPosition.setState( 2 );
                                this.curPosition = newNode;
                                this.numOfMove++;
                                break;

                        case 5:
                                this.map[this.getCurPosition().getyPos()][this.getCurPosition().getxPos()] = 3;
                                //this.curPosition.setState( 3 );
                                this.curPosition = ( this.curPosition.getNext() );
                                this.numOfMove++;
                                break;

                        case 6:
                                return false;

                }
                return true;
        }

        public int[][] getMap() {
                return this.map;
        }

        public Node getCurPosition() {

                return this.curPosition;
        }

        public int getNumOfMove () {
                return this.numOfMove;
        }
}
