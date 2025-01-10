package gr.hua.dit.ds.ds2024Team77.service;

import gr.hua.dit.ds.ds2024Team77.entities.naUser;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import gr.hua.dit.ds.ds2024Team77.repository.naUserRepository;

import java.util.List;

@Service
public class naUserService {

    private naUserRepository naUserRepository;

    public naUserService(naUserRepository naUserRepository){
        this.naUserRepository = naUserRepository;
    }

    @Transactional
    public List<naUser> getnaUsers(){
        return naUserRepository.findAll();
    }

    @Transactional
    public naUser getnaUser(Integer user_id){
        return naUserRepository.findById(user_id).get();
    }

    @Transactional
    public void savenaUser(naUser user){
        naUserRepository.save(user);
    }
}
