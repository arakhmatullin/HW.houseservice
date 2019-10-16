package ru.itpark;

import ru.itpark.model.House;
import java.util.ArrayList;

public class HouseService {

    private int id;
    private ArrayList<House> housesList;

    public HouseService() {
        this.housesList = new ArrayList();
    }

    public void addHouse(long price, String district, String address) {
        id++;
        housesList.add(new House(id, price, district, address));
    }


    public ArrayList<House> searchHouses(int minPrice, int maxPrice, String districtList) {
        ArrayList searchedHouses = new ArrayList();
        for (House house : housesList) {
            if (house.getPrice() < minPrice) continue;
            if (house.getPrice() > maxPrice) continue;
            if ( ! districtList.toLowerCase().contains(house.getDistrict().toLowerCase())) continue;
            searchedHouses.add(house);
        }
        return searchedHouses;
    }


}
