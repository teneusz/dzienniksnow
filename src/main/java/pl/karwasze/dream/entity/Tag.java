package pl.karwasze.dream.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Tenek on 17.07.2017.
 */

@Entity(name = "v_all_tags")
@Immutable
@Getter
@ToString
@EqualsAndHashCode
public class Tag {

    @Id
    private Long id;

    private String name;

    private Boolean isAdult;

}
