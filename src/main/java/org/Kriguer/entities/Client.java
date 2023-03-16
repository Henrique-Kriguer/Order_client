package org.Kriguer.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private String name;
    private Date birthdate;
    private String email;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Client(String name, Date birthdate, String email) {
        this.name = name;
        this.birthdate = birthdate;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return name + " (" + sdf.format(birthdate) + ") - " + email + "\n";
    }
}
