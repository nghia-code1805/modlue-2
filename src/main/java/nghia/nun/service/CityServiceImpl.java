package nghia.nun.service;

import nghia.nun.model.city;
import nghia.nun.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CityServiceImpl implements CityService {

    @Autowired
    CityRepository cityRepository;

//    @Override
//    public Iterable<city> findAll() {
//        return cityRepository.findAll();
//    }

    @Override
    public Iterable<city> findAll() {
        return cityRepository.findAll();
    }

    @Override
    public city findById(Long id) {
        return cityRepository.findOne(id);
    }

//    @Override
//    public city findById(Long id) {
//        return cityRepository.findById(id);
//    }

    @Override
    public void save(city city) {
        cityRepository.save(city);
    }

    @Override
    public void remove(Long id) {
        cityRepository.delete(id);
    }
}
