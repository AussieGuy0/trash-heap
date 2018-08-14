package au.com.anthonybruno.nobsblog.authentication;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class AuthUtils {

    public static UserDetails getUserDetails() {
        return (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

    public static void removeSession() {
        SecurityContextHolder.getContext().setAuthentication(null);
    }
}
