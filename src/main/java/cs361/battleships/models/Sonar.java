package cs361.battleships.models;

public class Sonar {

    private Square center;
    private List<Square> revealedShips;                     //list of squares with ships
    private List<Square> revealedSquares;                   //list of squares without ships


    public Sonar(){}

    public Square getCenter(){
        return this.center;
    }

    public void setCenter(Square newSquare){
        this.center = newSquare;
    }

    public List<Square> getRevealedShips() {
        return this.revealedShips;
    }

    public void setRevealedShips(List<Square> revealedShips) {
        this.revealedShips = revealedShips;
    }

    public List<Square> getRevealedSquares() {
        return this.revealedSquares;
    }

    public void setRevealedSquares(List<Square> revealedSquares) {
        this.revealedSquares = revealedSquares;
    }

}