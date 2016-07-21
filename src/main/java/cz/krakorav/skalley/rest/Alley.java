package cz.krakorav.skalley.rest;

/**
 * Created by craa on 21.7.16.
 */
public class Alley {
    private long id;
    private String name;
    private String address;
    private int phone;



    public Alley(long id, String name) {
        this.id = id;
        this.name = name;
    }

    /* Getters and Setters */
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
