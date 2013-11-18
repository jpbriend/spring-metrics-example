package fr.mudak.examples.spring.metrics.dao;

import fr.mudak.examples.spring.metrics.domain.MyData;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MyDao {

    public List<MyData> findAll() {
        return new ArrayList<MyData>();
    }

    public MyData findById(long id) {
        return new MyData(id, "", "");
    }
}
