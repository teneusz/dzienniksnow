package pl.karwasze.dream.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.karwasze.user.entity.UserEntity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

/**
 * Created by Tenek on 13.07.2017.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "dream")
public class DreamEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dream_id")
    Long id;

    @Column(name = "dream_description")
    @Size(max = 1024)
    String description;

    @Column(name = "dream_create_date")
    Date createDate;

    @Column(name = "dream_title")
    @Size(max = 64)
    String title;

    @Column(name = "dream_is_adult")
    Boolean adult;

    @Column(name = "dream_is_lucid")
    Boolean lucid;

    @Column(name = "dream_score")
    @Max(10)
    @Min(1)
    Integer score;

    @Column(name = "dream_night_index")
    @Max(9)
    @Min(1)
    Integer nightIndex;

    @ManyToOne
    @JoinColumn(name = "user_id")
    UserEntity userEntity;

    @ManyToMany
    @JoinTable(name = "dream_tag", joinColumns = @JoinColumn(name = "dream_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    Set<Tag> tags;


}
