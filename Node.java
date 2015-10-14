package maze;

/**
 * Created by DH on 2015. 10. 13..
 * Last modification 2015. 10. 14..
 */
class Node {
    private int xPos;
    private int yPos;
    private int state;
    private Node next;

    Node () {
        this( 0, 0, null);
    }
    Node ( int xPos, int yPos ) {
        this( xPos, yPos, null );
    }

    Node ( int xPos, int yPos, Node next ) {
        this.xPos = xPos;
        this.yPos = yPos;
        setNext ( next );
    }

    Node getNext () {
        return this.next;
    }

    void setNext(Node next) {
        this.next = next;
    }

    int getxPos() {
        return this.xPos;
    }
    int getyPos() {
        return this.yPos;
    }

    void setState( int state ) {
        this.state = state;
    }

}
