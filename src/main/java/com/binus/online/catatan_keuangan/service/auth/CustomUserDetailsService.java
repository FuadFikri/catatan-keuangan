package com.binus.online.catatan_keuangan.service.auth;

import com.binus.online.catatan_keuangan.entity.User;
import com.binus.online.catatan_keuangan.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.stereotype.Service;

import static org.springframework.security.core.userdetails.User.withUsername;

@RequiredArgsConstructor
@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;



    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));

        UserBuilder builder = withUsername(user.getEmail());
        builder.password(user.getPassword());
        builder.roles("USER");
        return builder.build();
    }
}
