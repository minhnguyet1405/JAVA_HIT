package Model;

public class Account {
    private static long idAc=100;
    private long id;
    private String fullName;
    private String userName;
    private String email;
    private String password;
    private String creaAt;

    public Account() {
    }

    public Account(long id, String fullName, String userName, String email, String password, String creaAt) {
        if(id==0)
            this.id = idAc++;
        else
            this.id=id;
        this.id=id;
        this.fullName = fullName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.creaAt = creaAt;
    }

    public static long getIdAc() {
        return idAc;
    }

    public static void setIdAc(long idAc) {
        Account.idAc = idAc;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreaAt() {
        return creaAt;
    }

    public void setCreaAt(String creaAt) {
        this.creaAt = creaAt;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", creaAt='" + creaAt + '\'' +
                '}';
    }
}
