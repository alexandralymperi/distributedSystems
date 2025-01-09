package gr.hua.dit.ds.ds2024Team77.dao;

import gr.hua.dit.ds.ds2024Team77.entities.naUser;
import java.util.List;

public interface usersDao {

    public List<naUser> getUsers();
    public naUser getUser(Integer user_id);
    public void saveUser(naUser user);
    public void deleteUser(Integer user_id);

    //TODO public void updateUser(Integer user_id);

}
