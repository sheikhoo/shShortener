package ir.sheikhoo.shshortener.users.repository;

import ir.sheikhoo.shshortener.users.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {
}
