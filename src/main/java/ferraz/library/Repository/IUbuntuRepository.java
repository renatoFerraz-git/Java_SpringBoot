package ferraz.library.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ferraz.library.Entity.Ubuntu;

@Repository
public interface IUbuntuRepository extends CrudRepository<Ubuntu, Long> { }