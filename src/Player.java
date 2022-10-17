public class Player extends Human{
    private String position;
    private int rating;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setPlayer(String name,String surname,int age,String pos,int rat){
        setName(name);
        setSurname(surname);
        setAge(age);
        setRating(rat);
        setPosition(pos);
    }

}
