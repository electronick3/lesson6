package ru.chagay.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;
import ru.chagay.models.CompanyEntity;

@Repository(CompanyRepository.NAME)
public interface CompanyRepository  extends PagingAndSortingRepository<CompanyEntity, String> {

    @NonNull
    String NAME = "companyRepository";

    CompanyEntity getByIdcompany(String id);
}
