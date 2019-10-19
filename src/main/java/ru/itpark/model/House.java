package ru.itpark.model;

public class House {
    private int id;
    private long price;
    private String address;
    private String district;

    public House(int id, long price, String district, String address) {
        this.id = id;
        this.price = price;
        this.district = district;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public long getPrice() {
        return price;
    }

    public String getDistrict() {
        return district;
    }
}
