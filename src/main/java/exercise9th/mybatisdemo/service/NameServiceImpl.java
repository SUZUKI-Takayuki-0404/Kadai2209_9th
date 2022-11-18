package exercise9th.mybatisdemo.service;

import exercise9th.mybatisdemo.entity.Name;
import exercise9th.mybatisdemo.exceptionhandlers.NameNotFoundException;
import exercise9th.mybatisdemo.mapper.NameMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NameServiceImpl implements NameService {

    private NameMapper nameMapper;

    public NameServiceImpl(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    @Override
    public List<Name> findAll() {
        return nameMapper.findAll();
    }

    @Override
    public Name findById(int id) throws Exception {
        Optional<Name> nameOptional = nameMapper.findById(id);
        if (nameOptional.isPresent()) {
            return nameOptional.get();
        } else {
            throw new NameNotFoundException("ID:" + id + " Not Found");
        }
    }

}
