public class Physician extends Human{
    private int experience;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public void setPhysician(String name,String surname,int age,int exp){
        setName(name);
        setSurname(surname);
        setAge(age);
        setExperience(exp);
    }
}
