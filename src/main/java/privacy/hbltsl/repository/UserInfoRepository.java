package privacy.hbltsl.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import privacy.hbltsl.model.UserInfo;

@Repository
public interface UserInfoRepository extends MongoRepository<UserInfo, Long> {

}
