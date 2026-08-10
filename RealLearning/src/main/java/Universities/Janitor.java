package Universities;

//This is the Janitor class
class Janitor extends Person {

    private String cleanArea;

    public Janitor(int id, String name, int age, String email, String cleanArea) {
        super(id, name, age, email);
        this.cleanArea = cleanArea;
    }

    public void setCleanArea(String cleanArea){
        this.cleanArea = cleanArea;
    }

    public String getCleanArea(){
        return cleanArea;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName()
                + " and I clean on the " + getCleanArea());
    }
}