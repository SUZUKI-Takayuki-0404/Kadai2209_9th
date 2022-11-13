package exercise9th.mybatisdemo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NameServiceImpl implements NameService{

    private NameMapper nameMapper;

    public NameServiceImpl(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    @Override
    public List<Name> findAll(){
        return nameMapper.findAll();
    }

    public Name findById(int id) throws Exception{
         return nameMapper.findById(id).get();
    }

}
