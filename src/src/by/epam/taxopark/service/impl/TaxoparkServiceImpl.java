package by.epam.taxopark.service.impl;

import by.epam.taxopark.dao.AutoDao;
import by.epam.taxopark.dao.impl.AutoDaoSqlImpl;
import by.epam.taxopark.entity.Auto;
import by.epam.taxopark.service.TaxoParkService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaxoparkServiceImpl implements TaxoParkService {

    AutoDao uatoparkDB = new AutoDaoSqlImpl();

    @Override
    public List<Auto> getAuto() {

      /* List<Auto> autoparkManual = new ArrayList<>();
        autoparkManual.add(new Auto(1, "mazda", 2.0, "red"));
        autoparkManual.add(new Auto(1, "audi", 2.0, "red"));
        autoparkManual.add(new Auto(1, "opel", 2.0, "red"));
        autoparkManual.add(new Auto(1, "mazda", 2.2, "blue"));
        autoparkManual.add(new Auto(1, "mazda", 2.2, "black"));

        return autoparkManual;*/



        return uatoparkDB.readAll();
    }

}
