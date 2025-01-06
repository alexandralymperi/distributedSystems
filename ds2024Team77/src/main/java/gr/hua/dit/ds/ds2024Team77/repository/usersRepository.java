package gr.hua.dit.ds.ds2024Team77.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import gr.hua.dit.ds.ds2024Team77.entities.users;

@Repository
public interface usersRepository extends JpaRepository<users, Integer> {
}
