package top.zhyee.springbootproctice.controller;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.zhyee.springbootproctice.entity.User;
import top.zhyee.springbootproctice.service.UserService;

import java.util.List;

/**
 * @author zhyee
 * @date 2018/7/10 上午11:02
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ApiOperation(value = "获取用户列表")
    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @ApiOperation(value = "根据id删除用户")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "Long")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable(value = "id") long id) {
        userService.deleteById(id);
    }

    @ApiOperation(value = "根据id修改用户")
    @ApiImplicitParam(name = "id", value = "用户id", required = true, dataType = "Long")
    @PutMapping("/{id}")
    public User updateUser(@PathVariable(value = "id") long id, @RequestBody User user) throws Exception {
        user.setId(id);
        return userService.updateUser(user);
    }

    @ApiOperation(value = "创建新用户")
    @ApiImplicitParam(name = "user", value = "用户实体", required = true, dataType = "User")
    @PostMapping
    public User create(@RequestBody User user) {
        return userService.create(user);
    }
}
