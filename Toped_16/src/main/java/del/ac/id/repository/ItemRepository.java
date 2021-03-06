package del.ac.id.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import del.ac.id.jpa.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item, String>{

}
