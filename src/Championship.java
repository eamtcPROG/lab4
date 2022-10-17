public class Championship extends Ranking{
    private String cWinner;

    public String getcWinner() {
        return cWinner;
    }

    public void setcWinner(String cWinner) {
        this.cWinner = cWinner;
    }
    public void playChampionship(){
        calcGameP();
        if(getPoints() > 0){
            setcWinner("Team 1");
        }
        else {
            setcWinner("Team 2");
        }
    }
}
