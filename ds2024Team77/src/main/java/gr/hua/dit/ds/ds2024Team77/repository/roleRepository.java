package gr.hua.dit.ds.ds2024Team77.repository;

import gr.hua.dit.ds.ds2024Team77.entities.role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface roleRepository extends JpaRepository<role, Integer> {

    Optional<role> findByName(String roleName);

    default role updateOrInsert(role role){
        role existingRole = findByName(role.getName()).orElse(null);

        if(existingRole != null ){
            return existingRole;
        }else{
            return save(role);
        }
    }

}
