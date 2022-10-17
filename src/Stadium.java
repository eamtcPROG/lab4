import java.util.Random;

public class Stadium extends Team{
    private int numOfSeats;

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }
    public void setStadium(){
        Random rand = new Random();
        int r = rand.nextInt(100000);
        setNumOfSeats(r);
        if (getNumOfSeats() >10000){
            setRating(getRating(0)+5);
        }else {
            setRating(getRating(0)-10);
        }
    }
}
