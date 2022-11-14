package exercise9th.mybatisdemo;

import exercise9th.mybatisdemo.entity.Name;
import exercise9th.mybatisdemo.mapper.NameMapper;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public Name findById(int id) throws Exception{
         return nameMapper.findById(id).get();
    }

}
