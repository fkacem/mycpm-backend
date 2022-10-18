package tn.telecom.mgmtbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.telecom.mgmtbackend.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
