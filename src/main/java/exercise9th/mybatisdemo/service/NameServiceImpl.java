package exercise9th.mybatisdemo.service;

import exercise9th.mybatisdemo.entity.Name;
import exercise9th.mybatisdemo.exceptionhandlers.NameNotFoundException;
import exercise9th.mybatisdemo.mapper.NameMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class NameServiceImpl implements NameService {

    private NameMapper nameMapper;

    @Override
    public List<Name> findAll() {
        return nameMapper.findAll();
    }

    @Override
    public Name findById(int id) throws Exception {
        return nameMapper.findById(id).orElseThrow(() -> new NameNotFoundException("ID:" + id + " Not Found"));
    }

}
