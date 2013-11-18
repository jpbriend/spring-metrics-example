package fr.mudak.examples.spring.metrics.service;

import fr.mudak.examples.spring.metrics.dao.MyDao;
import fr.mudak.examples.spring.metrics.domain.MyData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {

    @Autowired
    private MyDao myDao;

    public List<MyData> getAllData() {
        return this.myDao.findAll();
    }

    public MyData getMyData(long id) {
        return this.myDao.findById(id);
    }

}
