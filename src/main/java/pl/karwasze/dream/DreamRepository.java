package pl.karwasze.dream;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.karwasze.dream.entity.DreamEntity;
import pl.karwasze.user.entity.UserEntity;

import java.util.Set;

/**
 * Created by Tenek on 17.07.2017.
 */
//@Projection(types = DreamEntity.class, name = "dream")
//@RepositoryRestResource(path = "dream")
//@Repository
interface DreamRepository extends CrudRepository<DreamEntity, Long> {

//    Set<DreamEntity> findDreamsByUser(UserEntity userEntity);
//    Set<DreamEntity> findDreamsByUserAndAdultIsTrue(UserEntity userEntity);
//    Set<DreamEntity> findDreamsByUserAndLucidIsTrue(UserEntity userEntity);
//    Set<DreamEntity> findDreamsByUserAndAdultIsFalse(UserEntity userEntity);
//    Set<DreamEntity> findDreamsByUserAndLucidIsFalse(UserEntity userEntity);
//    Set<DreamEntity> findDreamsByCreateDateBetween(Date startDate,Date endDate);

}
