package apptest;

import apptest.JsonModel.Weather;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Weather", path = "weather")
public interface WeatherRepository extends MongoRepository<Weather,String> {
  Weather findByName(String name);
}