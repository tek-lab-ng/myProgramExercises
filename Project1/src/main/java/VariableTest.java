public class VariableTest {

    String name = "Gabriel";

    public void callName(){
        System.out.println(name);
    }

    public String getName(){
        String name = "Chinedu";
        System.out.println(name);
        return name;    }

    public static void main(String[] args) {

        VariableTest st = new VariableTest();

        st.callName();
        st.getName();
        


    }
}
