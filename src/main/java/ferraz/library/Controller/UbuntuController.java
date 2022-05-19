package ferraz.library.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ferraz.library.Entity.Ubuntu;
import ferraz.library.Service.Service.UbuntuService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class UbuntuController
{
    @Autowired
    private UbuntuService ubuntuService;

    // Post operation
    @PostMapping("/ubuntus")
    public Ubuntu post(@Valid @RequestBody Ubuntu ubuntu)
    {
        return ubuntuService.post(ubuntu);
    }

    // Get operation
    @GetMapping("/ubuntus")
    public List<Ubuntu> get()
    {
        return ubuntuService.get();
    }

    // GetId operation
    @GetMapping("/ubuntus/{id}")
    public Optional<Ubuntu> getId(@PathVariable("id") Long id)
    {
        return ubuntuService.getById(id);
    }

    // Update operation
    @PutMapping("/ubuntus/{id}")
    public Ubuntu update(@RequestBody Ubuntu ubuntu, @PathVariable("id") Long id)
    {
        return ubuntuService.update(ubuntu, id);
    }

    // Delete operation
    @DeleteMapping("/ubuntus/{id}")
    public String delete(@PathVariable("id") Long id)
    {
        ubuntuService.delete(id);
        return "Deleted Successfully";
    }
}
