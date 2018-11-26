package edu.poly.valaditor;

import edu.poly.entity.Partners;
import edu.poly.impl.PartnerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


/**
 * @author imssbora
 */
@Component
public class PartnerValidator implements Validator {

    @Autowired
    PartnerImpl partner;

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.equals(Partners.class);
    }

    @Override
    public void validate(Object obj, Errors err) {
        Partners partners = (Partners) obj;
        if(partners.getId() == 0){
            if(partner.existsByEmail(partners.getEmail())){
                err.rejectValue("email", "partners.email.invalid");
            }
            if(!partners.getPhone().matches("(\\+)?\\d{10,11}")){
                err.rejectValue("phone", "partners.phone.typemismatch");
            }

            if(partner.existsByPhone(partners.getPhone())){
                err.rejectValue("phone", "partners.phone.invalid");
            }
        } else {
            Partners pn = partner.getById(partners.getUserId());
            if (!partners.getEmail().equals(pn.getEmail())) {
                if (partner.existsByEmail(partners.getEmail())) {
                    err.rejectValue("email", "users.email.invalid");
                }
            }
            if (!partners.getPhone().equals(pn.getPhone())) {
                if (partner.existsByPhone(partners.getPhone())) {
                    err.rejectValue("phone", "users.phone.invalid");
                }
                if (!partners.getPhone().matches("(\\+)?\\d{10,11}")) {
                    err.rejectValue("phone", "users.phone.typemismatch");
                }
            }
        }



    }

}
