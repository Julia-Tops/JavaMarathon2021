package day17;

public class ChessBoard {
    private ChessPiece[][] chessPieces;

    public ChessBoard(ChessPiece[][] chessPieces) {
        this.chessPieces = chessPieces;
    }

    public void print(){
        for (int i = 0; i < this.chessPieces.length; i++) {
            for (int j = 0; j < this.chessPieces[i].length; j++) {
                System.out.print(chessPieces[i][j]);
                if(j == this.chessPieces[i].length - 1){
                    System.out.print("\n");
                }
            }

        }
    }
}
