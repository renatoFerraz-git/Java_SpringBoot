package ferraz.library.Service.Interface;

import ferraz.library.Entity.Ubuntu;

import java.util.List;
import java.util.Optional;

public interface IUbuntuService
{
    // Post operation
    Ubuntu post(Ubuntu ubuntu);

    // Get operation
    List<Ubuntu> get();

    // Get operation
    Optional<Ubuntu> getById(Long id);

    // Update operation
    Ubuntu update(Ubuntu ubuntu, Long ubuntuId);

    // Delete operation
    void delete(Long ubuntuId);
}
