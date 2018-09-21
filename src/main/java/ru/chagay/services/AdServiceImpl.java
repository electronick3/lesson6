package ru.chagay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.chagay.models.AdEntity;
import ru.chagay.models.CategoryEntity;
import ru.chagay.repository.AdRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AdServiceImpl implements AdService {

    @Qualifier("adRepository")
    @Autowired
    AdRepository adRepository;

    @Transactional
    public AdEntity save(AdEntity ad){
        return adRepository.save(ad);
    }

    @Transactional
    public void deleteById(String id){
        adRepository.deleteByIdad(id);
    }

    @Transactional(readOnly = true)
    public Optional<AdEntity> findByIdad(String id){
        return adRepository.findByIdad(id);
    }

    @Transactional(readOnly = true)
    public List<AdEntity> findAll(){
        return (List<AdEntity>) adRepository.findAll();
    }

    @Transactional(readOnly = true)
    public List<AdEntity> findByCategory(CategoryEntity categoryEntity){
        return adRepository.findByCategoryEntity(categoryEntity);
    }
}
