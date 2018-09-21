package ru.chagay.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.chagay.models.CompanyEntity;
import ru.chagay.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService{

    @Autowired
    CompanyRepository companyRepository;

    @Transactional(readOnly = true)
    public CompanyEntity findById(String id){
        return companyRepository.getByIdcompany(id);
    }
}
