package nghia.nun.service;

import nghia.nun.model.city;

public interface CityService  {
    Iterable<city> findAll();
    city findById(Long id);
    void save(city city);
    void remove(Long id);
}
