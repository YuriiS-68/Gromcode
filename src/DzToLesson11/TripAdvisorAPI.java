package DzToLesson11;

/**
 * Created by Skorodielov on 25.06.2017.
 */
public class TripAdvisorAPI implements API {

    Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (Room room : rooms) {
            if (room.getPrice() == price && room.getCityName() == city && room.getHotelName() == hotel){
                if (room.getPersons() >= persons - 1 && room.getPersons() <= persons + 1) {
                    count++;
                }
            }
        }

        Room[] foundRooms = new Room[count];
        int index = 0;
        for (Room room : rooms) {
            if (room.getPrice() == price && room.getCityName() == city && room.getHotelName() == hotel){
                if (room.getPersons() >= persons - 1 && room.getPersons() <= persons + 1) {
                    foundRooms[index] = room;
                    index++;
                }
            }
        }
        return foundRooms;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
