package top.zhyee.springbootproctice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.zhyee.springbootproctice.entity.User;

/**
 * @author zhyee
 * @date 2018/7/10 上午11:25
 */
@Repository
public interface UserRepositury extends JpaRepository<User, Long> {
}
