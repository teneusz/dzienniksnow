package pl.karwasze.user.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by Tenek on 17.07.2017.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "USER")
public class UserEntity implements Serializable {

    @Column(name = "user_id")
    @Id
    @GeneratedValue
    private Long id;


    @Column(name = "user_nickname", nullable = false, unique = true)
    private String nickname;

    @Column(name = "user_password", nullable = false, length = 128)
    private String password;

    @Column(name="user_birthdate")
    private Date birthDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_gender")
    private Gender gender;

    public enum Gender{
        FEMALE("f"),MALE("m");

        private final String value;

        private Gender(String value)
        {
            this.value = value;
        }
    }
}
