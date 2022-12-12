package ir.sheikhoo.shshortener.link.repository;

import ir.sheikhoo.shshortener.link.model.Link;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinkRepository extends JpaRepository<Link,Long> {
}
