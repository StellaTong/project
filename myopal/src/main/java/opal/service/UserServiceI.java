package opal.service;

import opal.model.User;

import java.util.List;

/**
 * Created by dongsidou on 2016/6/24.
 */
public interface UserServiceI {

    //通过Id查找用户
    public User getUserById(Integer id);

    //通过Id删除用户
    public int deleteUserById(Integer id);

    //插入用户记录
    public int insert(User record);


    public User getUserByUserName(String username);

    //显示用户列表
    public List<User> getAll();

    //更新用户信息
    public int updateUser(User user);

}
