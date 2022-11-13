package exercise9th.mybatisdemo;

import java.util.List;

public interface NameService {

    List<Name> findAll();

    Name findById(int id) throws Exception;

}
