package pl.karwasze.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.karwasze.user.entity.UserEntity;

/**
 * Created by Tenek on 17.07.2017.
 */

@RepositoryRestResource(path = "users",excerptProjection = UserProjection.class)
public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
