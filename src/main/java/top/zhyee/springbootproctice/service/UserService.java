package top.zhyee.springbootproctice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.zhyee.springbootproctice.entity.User;
import top.zhyee.springbootproctice.repository.UserRepositury;

import java.util.List;
import java.util.Objects;

/**
 * @author zhyee
 * @date 2018/7/10 上午11:27
 */
@Service
public class UserService {

    private final UserRepositury userRepositury;

    @Autowired
    public UserService(UserRepositury userRepositury) {
        this.userRepositury = userRepositury;
    }

    public List<User> getUsers() {
        return userRepositury.findAll();
    }

    public void deleteById(long id) {
        userRepositury.delete(id);
    }

    public User updateUser(User user) throws Exception {
        User origin = userRepositury.findOne(user.getId());
        if (Objects.isNull(origin)) {
            throw new Exception("用户不存在");
        }
        if (!Objects.isNull(user.getPhoneNumber())) {
            origin.setPhoneNumber(user.getPhoneNumber());
        }
        if (!Objects.isNull(user.getUserName())) {
            origin.setUserName(user.getUserName());
        }
        if (!Objects.isNull(user.getEmail())) {
            origin.setEmail(user.getEmail());
        }
        return userRepositury.save(origin);
    }

    public User create(User user) {
        return userRepositury.save(user);
    }
}
