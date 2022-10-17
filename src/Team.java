import java.util.Random;

public class Team extends Coach{
    private String name;
    private int rating;


    public int getRating(int r) {
        return rating +r;
    }

    @Override
    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    public void setTeam(String name){
        Random rand = new Random();
        setName(name);
        Human h1 = new Human();
        h1.setName("Simione");
        h1.setSurname("Diego");
        h1.setAge(50);
        setCoach(h1.getName(),h1.getSurname(),h1.getAge(),6);
        if (getRating() > 5){
            setRating(getRating() + 1);
        }else {
            setRating(getRating() - 2);
        }
        Human h2 = new Human();
        h2.setName("Player");
        h2.setSurname("1");
        h2.setAge(20);
        Player p1 = new Player();
        int rat = rand.nextInt(10);
        p1.setPlayer(h2.getName(),h2.getSurname(),h2.getAge(),"GK",rat);
        Human h3 = new Human();
        h3.setName("Player");
        h3.setSurname("2");
        h3.setAge(25);
        Player p2 = new Player();
        rat = rand.nextInt(10);
        p2.setPlayer(h3.getName(),h3.getSurname(),h3.getAge(),"CM",rat);
        Human h4 = new Human();
        h4.setName("Player");
        h4.setSurname("3");
        int age = rand.nextInt(22) + 18;
        h4.setAge(age);
        Player p3 = new Player();
        rat = rand.nextInt(10);
        p3.setPlayer(h4.getName(),h4.getSurname(),h4.getAge(),"FW",rat);
        if(p3.getRating() > 8){
            setRating(p3.getRating());
            setRating(getRating(2));
        }
        Physician ph = new Physician();
        rat = rand.nextInt(10);
        ph.setPhysician(h1.getName(),h1.getSurname(),h1.getAge(),rat);
        if (ph.getExperience() >5){
            setRating(getRating(10));
        }
    }
}
