package maze;

/**
 * Created by DH on 2015. 10. 13..
 */
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
