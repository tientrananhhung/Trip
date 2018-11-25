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

        if(partner.existsByEmail(partners.getEmail())){
            err.rejectValue("email", "partners.email.invalid");
        }

        if(partner.existsByPhone(partners.getPhone())){
            err.rejectValue("phone", "partners.phone.invalid");
        }

    }

}
