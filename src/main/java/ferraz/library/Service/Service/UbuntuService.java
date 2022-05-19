package ferraz.library.Service.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ferraz.library.Entity.Ubuntu;
import ferraz.library.Repository.IUbuntuRepository;
import ferraz.library.Service.Interface.IUbuntuService;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UbuntuService implements IUbuntuService
{
    @Autowired
    private IUbuntuRepository _ubuntuRepository;

    // POST
    @Override
    public Ubuntu post(Ubuntu ubuntu)
    {
        return _ubuntuRepository.save(ubuntu);
    }

    // GET
    @Override
    public List<Ubuntu> get()
    {
        return (List<Ubuntu>) _ubuntuRepository.findAll();
    }

    // GET ID
    @Override
    public Optional<Ubuntu> getById(Long id)
    {
        return _ubuntuRepository.findById(id);
    }

    // UPDATE
    @Override
    public Ubuntu update(Ubuntu ubuntu, Long ubuntuId) {
        Ubuntu Db = _ubuntuRepository.findById(ubuntuId).get();

        if (Objects.nonNull(ubuntu.getName()) && !"".equalsIgnoreCase(ubuntu.getName()))
            Db.setName(ubuntu.getName());

        if (Objects.nonNull(ubuntu.getUsername()) && !"".equalsIgnoreCase(ubuntu.getUsername()))
            Db.setUsername(ubuntu.getUsername());

        return _ubuntuRepository.save(Db);
    }

    // DELETE
    @Override
    public void delete(Long ubuntuId)
    {
        _ubuntuRepository.deleteById(ubuntuId);
    }
}
