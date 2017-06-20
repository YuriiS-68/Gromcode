package DzToLesson9;

/**
 * Created by Skorodielov on 13.06.2017.
 */
public class UserRepository{
    public static void main(String[] args) {

    }
    private User[] users = new User[10];
    User user = new User(2453, "Ivan", "session");

    public User save(User user){
        if (user == null)
            return null;

        if (findById(user.getId()) != null)
            return null;

        int countPlaced = 0;
        for (User user1 : users) {
            if (user1 != null)
                countPlaced++;
        }

        if (countPlaced > 9)
            return null;

        int index = 0;
        for (User user1 : users) {
            if (user1 == null) {
                users[index] = user;
                break;
            }
            index++;
        }
        return user;
    }
    
    public User update(User user){
        if (user == null)
            return null;

        int index = 0;
        for (User user1 : users) {
            if (user1 == findById(user.getId())){
                users[index] = user;
                break;
            }
            index++;
        }
        return user;
    }
    
    public void delete(long id){
        int index = 0;
        for (User user1 : users) {
            if (user1 == findById(user.getId())){
                users[index] = null;
                break;
            }
            index++;
        }
    }
    
    private User findById(long id){
        for (User user : users) {
            if(user != null && id == user.getId())
                return user;
        }
        return null;
    }
}
