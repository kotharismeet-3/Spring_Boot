package dev.hashnode.merndeveloper.crud.repositry;

import dev.hashnode.merndeveloper.crud.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepositery extends MongoRepository<Movie, ObjectId> {

    public Optional<Movie> findByimdbId(String imdbId);
}
