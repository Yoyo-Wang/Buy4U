/*
 * Created by Osman Balci on 2016.04.23  * 
 * Copyright © 2016 Osman Balci. All rights reserved. * 
 */
package com.mycompany.validators;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("securityCodeValidator")
/**
 * Validates the credit card security code entered
 * 
 * @author Balci
 */
public class SecurityCodeValidator implements Validator {

    @Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        
        // Type cast the inputted "value" to enteredCreditCardSecurityCode of type String
        String enteredCreditCardSecurityCode = (String) value;

        if (enteredCreditCardSecurityCode == null || enteredCreditCardSecurityCode.isEmpty()) {
            // Do not take any action. 
            // The required="true" in the XHTML file will catch this and produce an error message.
            return;
        }
        
        // REGular EXpression (regex) to validate if the entered credit card security code consists of digits only
        String regex = "[0-9]*";
        
        if (!enteredCreditCardSecurityCode.matches(regex)) {
            throw new ValidatorException(new FacesMessage("Credit card security code must consist of only digits!"));
        }
        
        // Visa, MasterCard, and Discover credit card security codes are 3 digits. American Express uses 4 digits.

        if (enteredCreditCardSecurityCode.length() < 3 || enteredCreditCardSecurityCode.length() > 4 ) {
            throw new ValidatorException(new FacesMessage("Credit card security code must be either 3 or 4 digits long."));
        }
    } 
    
}