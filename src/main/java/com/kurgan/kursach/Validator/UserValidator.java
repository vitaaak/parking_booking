package com.kurgan.kursach.Validator;import com.kurgan.kursach.models.User;import com.kurgan.kursach.service.UserService;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Component;import org.springframework.validation.Errors;import org.springframework.validation.ValidationUtils;import org.springframework.validation.Validator;@Componentpublic class UserValidator implements Validator {    @Autowired    private UserService userService;    @Override    public boolean supports(Class<?> clazz) {        return User.class.equals(clazz);    }    @Override    public void validate(Object target, Errors errors) {        User cook = (User) target;        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "Required");        if (cook.getUsername().length() < 8 || cook.getUsername().length() > 32) {            errors.rejectValue("username", "Size.userForm.username");        }        if (userService.findByUsername(cook.getUsername()) != null) {            errors.rejectValue("username", "Duplicate.userForm.username");        }        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "Required");        if (cook.getUsername().length() < 8 || cook.getUsername().length() > 32) {            errors.rejectValue("password", "Size.userForm.password");        }        if (!cook.getConfirmPassword().equals(cook.getPassword())) {            errors.rejectValue("confirmPassword", "Different.userForm.password");        }    }}