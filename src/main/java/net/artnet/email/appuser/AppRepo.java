package net.artnet.email.appuser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;


@Repository
//@Transactional(readOnly = true)
public interface AppRepo extends JpaRepository<AppUser,Long> {

    Optional<AppUser> findByEmail(String email);
}
