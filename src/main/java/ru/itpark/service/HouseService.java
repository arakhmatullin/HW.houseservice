package ru.itpark.service;

import ru.itpark.model.House;

import java.util.ArrayList;
import java.util.List;

public class HouseService {

    private int id;
    private ArrayList<House> housesList;

    public HouseService() {
        this.housesList = new ArrayList<>();
    }

    public void addHouse(long price, String district, String address) {
        id++;
        housesList.add(new House(id, price, district, address));
    }


    public List<House> searchHouses(int minPrice, int maxPrice, String districts) {
        List<House> searchedHouses = new ArrayList<>();
        for (House house : housesList) {
            if (house.getPrice() < minPrice) {
                continue;
            }
            if (maxPrice > 0 && house.getPrice() > maxPrice) {
                continue;
            }
            if (districts.length() > 0 && !districts.toLowerCase().contains(house.getDistrict().toLowerCase())) {
                continue;
            }
            searchedHouses.add(house);
        }
        return searchedHouses;
    }


}
