public class Ranking extends Game{
    private int points;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    public void calcGameP(){
        setPoints(0);
        play();
        if(getWinner() == 1) {
            setPoints(getPoints()+1);
        }else{
            setPoints(getPoints()-1);
        }
        play();
        if(getWinner() == 1) {
            setPoints(getPoints()+1);
        }else{
            setPoints(getPoints()-1);
        }
        play();
        if(getWinner() == 1) {
            setPoints(getPoints()+4);
        }else{
            setPoints(getPoints()-1);
        }
    }
}
