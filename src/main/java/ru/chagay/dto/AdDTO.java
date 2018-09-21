package ru.chagay.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.chagay.models.AdEntity;
import ru.chagay.models.CategoryEntity;
import ru.chagay.models.CompanyEntity;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
@NoArgsConstructor
public final class AdDTO {

    private String idad;
    private String adname;
    private String content;
    private String phone;
    private String idcategory;
    private String idcompany;

    public AdDTO(final AdEntity ad) {
        if (ad == null) return;
        idad = ad.getIdad();
        adname = ad.getAdname();
        content = ad.getContent();
        phone = ad.getPhone();
        final CategoryEntity category = ad.getCategoryEntity();
        if (category != null){
            idcategory = category.getIdcategory();
        }
        final CompanyEntity company = ad.getCompanyEntity();
        if (company != null){
            idcompany = company.getIdcompany();
        }
    }
}
