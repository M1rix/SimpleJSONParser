package model;

public class People {
    private String name;
    private int mobile;
    private boolean aBoolean;
    private String pet;
    private String address;

    public People(String name, int mobile, boolean aBoolean, String pet, String address) {
        this.name = name;
        this.mobile = mobile;
        this.aBoolean = aBoolean;
        this.pet = pet;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getMobile() {
        return mobile;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public String getPet() {
        return pet;
    }

    public String getAddress() {
        return address;
    }
}
