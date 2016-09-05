package opal.service;

import opal.dao.UserMapper;
import opal.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dongsidou on 2016/6/24.
 */


@Service("userService")
public class UserServiceImpl implements UserServiceI {
    private UserMapper userMapper;
    private Integer id;
    private String username;

    public UserMapper getUserMapper() {
        return userMapper;
    }
    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
    @Override
    public User getUserById(Integer id) {
        this.id = id;
        return userMapper.selectByPrimaryKey(id);
    }
    public int updateUser(User user){
        return userMapper.updateByPrimaryKey(user);
    }
    public User getUserByUserName(String username){
        this.username = username;
        return  userMapper.selectByUserName(username);

    }
    public List<User> getAll(){

        return userMapper.getAll();
    }
    public int deleteUserById(Integer id){
        this.id=id;
        return userMapper.deleteByPrimaryKey(id);
    }
    public int insert(User record){
        return userMapper.insert(record);
    }



}
