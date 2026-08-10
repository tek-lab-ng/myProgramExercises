package Universities;

//This is the Security class
class Security extends Person {
    private int gateNumber;

    public Security(int id, String name, int age, String email, int gateNumber) {
        super(id, name, age, email);
        this.gateNumber = gateNumber;
    }

    public void setGateNumber(int gateNumber){
        this.gateNumber = gateNumber;
    }

    public int getGateNumber(){
        return gateNumber;
    }
    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName()
                + " and I work at Gate " + getGateNumber());
    }
}