public class Coach extends Human implements ICoach{
    private int rating;

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public void setCoach(String name, String surname, int age,int rating) {
        setName(name);
        setSurname(surname);
        setAge(age);
        setRating(rating);
    }
}
