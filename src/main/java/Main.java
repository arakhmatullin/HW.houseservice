import ru.itpark.model.House;
import ru.itpark.service.HouseService;

public class Main {
    public static void main(String[] args) {
        HouseService houseService = new HouseService();
        houseService.addHouse(1_000_000,"Приволжский","Адрес 1");
        houseService.addHouse(5_000_000,"Приволжский","Адрес 2");
        houseService.addHouse(2_000_000,"Советский","Адрес 3");
        houseService.addHouse(4_000_000,"Советский","Адрес 4");
        houseService.addHouse(1_000_000,"Вахитовский","Адрес 5");
        houseService.addHouse(2_000_000,"Вахитовский","Адрес 6");
        houseService.addHouse(5_000_000,"Советский","Адрес 7");
        for (House house : houseService.searchHouses(2_000_000,4_000_000,"советский,вахитовский")){
            System.out.println(""+house.getId()+" "+house.getAddress());
        }
        for (House house : houseService.searchHouses(0,2_000_000,"")){
            System.out.println(house.getId()+" "+house.getAddress());
        }

    }
}