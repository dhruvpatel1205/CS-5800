public class IndividualHolder extends AccountHolder implements InterfaceUtil {
    private String name;
    private String SSN;

    public IndividualHolder(int ID, String address, String name, String SSN) {
        super(ID, address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String convertNameUpperCase(String name) {
        System.out.println("This will uppercase the string");
        return name;
    }

    public String covertNameUpperCase(String name) {
        return name;
    }

}
