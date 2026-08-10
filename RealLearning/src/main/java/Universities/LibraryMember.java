package Universities;

//This is the Library Faculty class
abstract class  LibraryMember  extends Person{

    private String libraryCardNumber;

    public LibraryMember(int id, String name, int age, String libraryCardNumber, String email) {
        super(id, name, age, email);
        this.libraryCardNumber = libraryCardNumber;
    }

    public String getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(String libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }
}
