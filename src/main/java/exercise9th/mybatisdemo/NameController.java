package exercise9th.mybatisdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NameController {

    private final NameService nameService;

    public NameController(NameService nameService) {
        this.nameService = nameService;
    }

    @GetMapping("/names")
    public List<Name> getNames(){
        return nameService.findAll();
    }

    @GetMapping("/names/{id}")
    public List<Name> getNameById(@PathVariable("id") int id) throws Exception {
        return List.of(nameService.findById(id));
    }

}
