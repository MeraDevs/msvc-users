package com.meradevs.msvc_users.validations.validators;

import org.springframework.beans.factory.annotation.Autowired;

import com.meradevs.msvc_users.repositories.UserRepository;
import com.meradevs.msvc_users.validations.annotations.UniqueEmail;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        if (email == null) {
            return true;
        }

        return !userRepository.existsByEmail(email);
    }

}
