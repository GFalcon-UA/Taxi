package taxi.dao;

import taxi.domain.TaxiDriver;

import java.util.List;

public interface TaxiDriverDao {
    TaxiDriver read(Long id);

    Long create(TaxiDriver taxiDriver);

    boolean update(TaxiDriver taxiDriver);

    boolean delete(TaxiDriver taxiDriver);

    List findAll();
}
