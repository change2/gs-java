package com.shclearing.database.serivce;

import com.shclearing.database.mappers.User;

/**
 * Created by change on 5/24/15.
 */
public interface UserDAO {

    public int saveUser(User user);
    public int deleteUser(int userID);
    public int updateUser(User user);
    public User searchUsers(int userID);
}
