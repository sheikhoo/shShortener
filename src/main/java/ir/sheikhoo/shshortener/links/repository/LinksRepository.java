package ir.sheikhoo.shshortener.links.repository;

import ir.sheikhoo.shshortener.links.model.Links;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LinksRepository extends JpaRepository<Links,Long> {
}
