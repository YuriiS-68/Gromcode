package DzToLesson11;

/**
 * Created by Skorodielov on 25.06.2017.
 */
public class Controller {

    private API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (API api : apis) {
            if (api != null) {
                count += api.findRooms(price, persons, city, hotel).length;
            }
        }
        Room[] searchResultForRoom = new Room[count];
        int index = 0;
        for (API api : apis) {
            if (api != null) {
                for (Room room : api.findRooms(price, persons, city, hotel)) {
                    searchResultForRoom[index] = room;
                    index++;
                }
            }
        }
        return searchResultForRoom;
    }

    public Room[] check(API api1, API api2) {

        int count = 0;
        for (Room room : api1.getAll()) {
            for (Room room1 : api2.getAll()) {
                if (room != null && room1 != null) {
                    if (room.getPersons() == room1.getPersons() && room.getPrice() == room1.getPrice() && room.getHotelName() == room1.getHotelName()) {
                        if (room.getCityName() == room1.getCityName()) {
                            count++;
                        }
                    }
                }
            }
        }
        Room[] result = new Room[count];
        int index = 0;
        for (Room room : api1.getAll()) {
            for (Room room1 : api2.getAll()) {
                if (room.getPersons() == room1.getPersons() && room.getPrice() == room1.getPrice() && room.getHotelName() == room1.getHotelName()) {
                    if (room.getCityName() == room1.getCityName()) {
                        if (room != null && room1 != null) {
                            result[index] = room;
                            index++;
                        }
                    }
                }
            }
        }
        return result;
    }
}