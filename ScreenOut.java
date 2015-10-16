package maze;

/**
 * Created by DH on 2015. 10. 13..
 * Last modification 2015. 10. 15..
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
                if ( y == p.getCurPosition().getyPos()
                        && x == p.getCurPosition().getxPos() ) {
                    System.out.print("◀▶");     // 플레이어 위치
                }
                else {
                    switch (p.getMap()[y][x]) {
                        case 0:
                            System.out.print("  ");
                            break;
                        case 1:
                            System.out.print("EE");
                            break;
                        case 2:
                            System.out.print("◁▷");
                            break;
                        case 3:
                            System.out.print("EE");
                            break;
                        case 4:
                            System.out.print("◀▷");
                            break;
                        case 5:
                            System.out.print("◁▶");
                    }
                }
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
            Thread.sleep ( 30 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void showResult ( Player p ) {
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
                if ( y == p.getCurPosition().getyPos()
                        && x == p.getCurPosition().getxPos() ) {
                    System.out.print("◀▶");     // 플레이어 위치
                }
                else {
                    switch (p.getMap()[y][x]) {
                        case 0:
                            System.out.print("  ");
                            break;
                        case 1:
                            System.out.print("EE");
                            break;
                        case 2:
                            System.out.print("◁▷");
                            break;
                        case 3:
                            System.out.print("  ");
                            break;
                        case 4:
                            System.out.print("◀▷");
                            break;
                        case 5:
                            System.out.print("◁▶");
                    }
                }
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
            Thread.sleep ( 300 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (p.getMap()[p.getCurPosition().getyPos()][p.getCurPosition().getxPos()] == 4) {
            System.out.println("갈 수 있는 길이 없습니다!");
        } else if (p.getMap()[p.getCurPosition().getyPos()][p.getCurPosition().getxPos()] == 5) {
            System.out.println("골인!");
        }
        }
}
