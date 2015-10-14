package maze;

/**
 * Created by DH on 2015. 10. 13..
 * Last modification 2015. 10. 14..
 */
public class ScreenOut {

    public static void showState ( Player p ) {
        for ( int i = 0; i < 100; i ++ ) {
            System.out.println("");
        }
        System.out.print("┌─");
        for ( int line = 0; line < p.getMap()[0].length -1; line ++ ) {
            System.out.print( "──" );
        }
        System.out.println("─┐");
        for(int y = 0; y < p.getMap().length; y++) {
            System.out.print("│");
            for(int x = 0; x < p.getMap()[0].length; x++) {
                if( p.getMap()[y][x] == 1 ) {    // 벽
                    System.out.print("EE");
                }
                if ( y == p.getCurPosition().getyPos()
                  && x == p.getCurPosition().getxPos() ) {
                    System.out.print("◀▶");     // 플레이어 위치
                }
                else if ( p.getMap()[y][x] == 0 ) { // 아직 안간길
                    System.out.print("  ");
                }
                else if ( p.getMap()[y][x] == 2 ) { // 지나온 길
                    System.out.print("◁▷");
                }
                else if (p.getMap()[y][x] == 3 ) { // 갔다가 돌아온길
                    System.out.print("  ");
                }
                else if ( p.getMap()[y][x] == 4 ) { // 출발지점
                    System.out.print("◀▷");
                }
                else if ( p.getMap()[y][x] == 5 ) // 도착지점
                    System.out.print("◁▶");
            }
            System.out.println("│");
        }
        System.out.print("├─");
        for ( int line = 0; line < p.getMap()[0].length -1; line ++ ) {
            System.out.print( "──" );
        }
        System.out.println("─┘");
        System.out.println("│움직인 횟수 : " + p.getNumOfMove() );
        System.out.print("└─");
        for ( int line = 0; line < p.getMap()[0].length -1; line ++ ) {
            System.out.print( "──" );
        }
        System.out.println("─┘");
        try {
            Thread.sleep ( 50 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void showResult ( Player p ) {

    }
}

