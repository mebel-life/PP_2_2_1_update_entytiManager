package hiber.dao;



import hiber.entity.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
   User getUser(int id);
   void updateUser(User user);
   void removeUser(User user);

}
