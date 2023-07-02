import java.util.*;

public class tictactoe1 {
  public static void main(String[] args) {
    char[][] board=new char[3][3];
    for(int i=0;i<board.length;i++){
      for(int j=0;j<board[0].length;j++){
        board[i][j]=' ';
      }
    }
    Scanner sc=new Scanner(System.in);
    char player='X';
    boolean gameover=false;
    while(!gameover){
      printboard(board);
      System.out.println("player "+player+" enter position in coordinates : ");
      int row=sc.nextInt();
      int col=sc.nextInt();
      if(board[row][col]==' '){
        board[row][col]=player;
        gameover=havewon(board,player);
        if(gameover){
          System.out.println("player "+player+"has won the game :)");
        }else{
          if(player=='X'){
            player='O';
          }else{
            player='X';
          }
        }
      }else{
        System.out.println("Invalid move mr :"+player+"please try again");

      }

      printboard(board);
    }
  }
  public static boolean havewon(char[][] board,char player){
    // row
    for(int row=0;row<board.length;row++){
if(board[row][0]==player && board[row][1]==player && board[row][2]==player){
      return true;
    }
    }
    // col
    for(int col=0;col<board[0].length;col++){
      if(board[0][col]==player && board[1][col]==player && board[2][col]==player){
      return true;
    }
    }
    // diagonal
    if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
      return true;
    }
    if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
      return true;
    }
    return false;
  }
  public static void printboard(char[][] board){
    for(int i=0;i<board.length;i++){
      System.out.println("---- +---+ ----");
      for(int j=0;j<board[0].length;j++){
        System.out.print("| "+board[i][j]+" |");
      }
    System.out.println();
      if(i==2){
        System.out.println("---- +---+ ----");
      }
    }
  }
  
}
