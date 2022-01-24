package Model;

public class Employee {
//    private static long idEmploy=1000;
    private long idEmploy;
    private String nameEmploy;
    private String ageEmploy;
    private String genderEmploy;
    private String addressEmploy;
    private String phoneEmploy;

    public Employee() {
    }

    public Employee(long idEmploy, String nameEmploy, String ageEmploy, String genderEmploy, String addressEmploy, String phoneEmploy) {
        this.idEmploy = idEmploy;
        this.nameEmploy = nameEmploy;
        this.ageEmploy = ageEmploy;
        this.genderEmploy = genderEmploy;
        this.addressEmploy = addressEmploy;
        this.phoneEmploy = phoneEmploy;
    }

    public long getIdEmploy() {
        return idEmploy;
    }

    public void setIdEmploy(long idEmploy) {
        this.idEmploy = idEmploy;
    }

    public String getNameEmploy() {
        return nameEmploy;
    }

    public void setNameEmploy(String nameEmploy) {
        this.nameEmploy = nameEmploy;
    }

    public String getAgeEmploy() {
        return ageEmploy;
    }

    public void setAgeEmploy(String ageEmploy) {
        this.ageEmploy = ageEmploy;
    }

    public String getGenderEmploy() {
        return genderEmploy;
    }

    public void setGenderEmploy(String genderEmploy) {
        this.genderEmploy = genderEmploy;
    }

    public String getAddressEmploy() {
        return addressEmploy;
    }

    public void setAddressEmploy(String addressEmploy) {
        this.addressEmploy = addressEmploy;
    }

    public String getPhoneEmploy() {
        return phoneEmploy;
    }

    public void setPhoneEmploy(String phoneEmploy) {
        this.phoneEmploy = phoneEmploy;
    }

}
