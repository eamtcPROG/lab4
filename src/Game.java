public class Game extends Stadium{
    private String wName;

    public String getwName() {
        return wName;
    }
    private int winner;

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    public void setwName(String wName) {
        this.wName = wName;
    }


    public void play(){
        setStadium();
        Team t1 = new Team();
        t1.setTeam("Team1");
        Team t2 = new Team();
        t2.setTeam("Team2");
        if (t1.getRating(0) < t2.getRating(0)){
            setwName(t2.getName());
            setWinner(1);
        }else {
            setwName(t1.getName());
            setWinner(2);
        }
    }

}
