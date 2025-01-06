package gr.hua.dit.ds.ds2024Team77.service;

import gr.hua.dit.ds.ds2024Team77.entities.users;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import gr.hua.dit.ds.ds2024Team77.repository.usersRepository;

import java.util.List;

@Service
public class usersService {

    private usersRepository usersRepository;

    public usersService(usersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    @Transactional
    public List<users> getUsers(){
        return usersRepository.findAll();
    }

    @Transactional
    public users getUser(Integer user_id){
        return usersRepository.findById(user_id).get();
    }

    @Transactional
    public void saveUser(users user){
        usersRepository.save(user);
    }
}
