package net.artnet.email.registration;

import lombok.AllArgsConstructor;
import net.artnet.email.appuser.AppUser;
import net.artnet.email.appuser.AppUserRole;
import net.artnet.email.appuser.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
//@AllArgsConstructor
public class RegistrationService {

    @Autowired
    private EmailValidator emailValidator;

    @Autowired
    private  AppUserService appUserService;

    public String register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator.test(request.getEmail());
        if(!isValidEmail){
            throw new IllegalStateException("email not valid");
        }
        return appUserService.sinUpUser(
                new AppUser(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        AppUserRole.USER
                )
        );
    }
}
