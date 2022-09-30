package pojo;

public class User {
    private  int userid;
    private  String uname;
    private   String upass;

    public User() {
    }

    public User(int userid, String uname, String upass) {
        this.userid = userid;
        this.uname = uname;
        this.upass = upass;
    }

    public int getUserid() {
        return userid;
    }

    public String getUname() {
        return uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", uname='" + uname + '\'' +
                ", upass='" + upass + '\'' +
                '}';
    }
}
