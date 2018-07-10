package top.zhyee.springbootproctice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.sql.Date;

/**
 * @author zhyee
 * @date 2018/7/10 上午11:07
 */
@Entity
@Data
@Table(name = "system_user")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "user_pwd")
    private String userPwd;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "create_time")
    @CreatedDate
    private Date CreateTime;

    @Column(name = "update_time")
    @LastModifiedDate
    private Date updateTime;
}
