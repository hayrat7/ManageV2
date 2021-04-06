package com.sid;

import com.sid.dao.DossierRepository;
import com.sid.entities.Role;
import com.sid.entities.User;
import com.sid.services.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class ManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManageApplication.class, args);
    }
    @Bean
    CommandLineRunner start(AccountService accountService, DossierRepository dossierRepository){
        return args -> {
            accountService.addRole(new Role(null,"USER"));
            accountService.addRole(new Role(null,"ADMIN"));


            accountService.addUser(new User(null,"user1","123",new ArrayList<>(),new ArrayList<>()));
            accountService.addUser(new User(null,"user2","123",new ArrayList<>(),new ArrayList<>()));
            accountService.addUser(new User(null,"user3","123",new ArrayList<>(),new ArrayList<>()));
            accountService.addUser(new User(null,"user4","123",new ArrayList<>(),new ArrayList<>()));

            accountService.addRoleToUser("user1","USER");
            accountService.addRoleToUser("user1","ADMIN");
            accountService.addRoleToUser("user2","ADMIN");
            /*User user=accountService.loadUserByName("ADMIN");
            user.getRoles().forEach(r ->{
                System.out.println(r.getRoleName());
            } );*/

        };
    }
}
