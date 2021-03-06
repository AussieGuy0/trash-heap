package au.com.anthonybruno.nobsblog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.NullRequestCache;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        UserDetails user = User.withDefaultPasswordEncoder().username("admin").password("password").roles("USER").build();
        auth.inMemoryAuthentication().getUserDetailsService().createUser(user);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .requestCache()
                .requestCache(new HttpSessionRequestCache())
                .and()
                .httpBasic()
                .and()
                .authorizeRequests()
                .anyRequest().authenticated();
    }
}
