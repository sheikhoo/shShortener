package ir.sheikhoo.shshortener.category.repository;

import ir.sheikhoo.shshortener.category.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
