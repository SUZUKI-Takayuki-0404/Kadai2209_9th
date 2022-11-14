package exercise9th.mybatisdemo.service;

import exercise9th.mybatisdemo.entity.Name;

import java.util.List;

public interface NameService {

    List<Name> findAll();

    Name findById(int id) throws Exception;

}
