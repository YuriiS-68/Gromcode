package DzToLesson11;

/**
 * Created by Skorodielov on 25.06.2017.
 */
public class BookingComAPI implements API {

    private Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (Room room : rooms) {
            if (room.getPersons() == persons && room.getCityName() == city && room.getHotelName() == hotel){
                if (room.getPrice() >= price - 100 && room.getPrice() <= price + 100) {
                    count++;
                }
            }
        }

        Room[] foundRooms = new Room[count];
        int index = 0;
        for (Room room : rooms) {
            if (room.getPersons() == persons && room.getCityName() == city && room.getHotelName() == hotel){
                if (room.getPrice() >= price - 100 && room.getPrice() <= price + 100) {
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
