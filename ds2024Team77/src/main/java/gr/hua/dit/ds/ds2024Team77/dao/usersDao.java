package gr.hua.dit.ds.ds2024Team77.dao;

import gr.hua.dit.ds.ds2024Team77.entities.users;
import java.util.List;

public interface usersDao {

    public List<users> getUsers();
    public users getUser(Integer user_id);
    public void saveUser(users user);
    public void deleteUser(Integer user_id);

    //TODO public void updateUser(Integer user_id);

}
