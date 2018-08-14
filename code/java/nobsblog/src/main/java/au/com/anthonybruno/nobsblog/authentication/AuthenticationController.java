package au.com.anthonybruno.nobsblog.authentication;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api/v1/auth")
public class AuthenticationController {

    @GetMapping
    public UserDetails check() {
       return AuthUtils.getUserDetails();
    }

    @GetMapping("/logout")
    public void logout() {
       AuthUtils.removeSession();
    }

}
