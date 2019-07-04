package com.master.springsecurity.service;


import com.master.springsecurity.entity.User;
import com.master.springsecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userRepository.findByUsername(username);
        CustomUserDetails customUserDetails=null;
        if(user!=null){
            customUserDetails=new CustomUserDetails();
            customUserDetails.setUser(user);


        }
        else
            throw new UsernameNotFoundException("Username not found"+username);

        return customUserDetails;
    }
}
