package taxi.dao;

import taxi.domain.Operator;

import java.util.List;

public interface OperatorDao {
    String create(Operator operator);

    Operator read(String login);

    boolean update(Operator operator);

    boolean delete(Operator operator);

    List<Operator> findAll();

    boolean auth(String login, String password);

    boolean isLoginUnique(String login);
}
