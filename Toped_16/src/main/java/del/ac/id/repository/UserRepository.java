package del.ac.id.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import del.ac.id.jpa.User;

public interface UserRepository extends MongoRepository<User, String>{

	User findByEmail(String email);
}
