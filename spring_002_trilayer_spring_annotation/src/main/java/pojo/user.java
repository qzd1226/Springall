package pojo;

import org.springframework.stereotype.Component;

public class user {
    private  int uid;
    private  String uname;
    private  int uage;
    public user(int uid, String uname, int uage){
        this.uage = uage;
        this.uid = uid;
        this.uname = uname;
    }

    @Override
    public String toString() {
        return "user{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", uage=" + uage +
                '}';
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }

    public int getUid() {
        return uid;
    }

    public String getUname() {
        return uname;
    }

    public int getUage() {
        return uage;
    }
}
