package dev.hashnode.merndeveloper.crud.service;

import dev.hashnode.merndeveloper.crud.model.Movie;
import dev.hashnode.merndeveloper.crud.repositry.MovieRepositery;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepositery movieRepositery;
    public List<Movie> getAll() {
        return movieRepositery.findAll();
    }

    public Optional<Movie> getDetail(ObjectId id) {
        return movieRepositery.findById(id);
    }

    public Optional<Movie> getDetailByImdbId(String imdbId) {
        return movieRepositery.findByimdbId(imdbId);
    }

}
