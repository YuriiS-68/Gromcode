package DzToLesson11;

/**
 * Created by Skorodielov on 25.06.2017.
 */
public interface API {

    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getAll();
}
