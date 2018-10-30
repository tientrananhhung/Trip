package edu.poly.service;

import edu.poly.model.Districts;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface DistrictService {

    public Iterable<Districts> findAll();

    public Optional<Districts> findOne(Integer id);

    public Districts save(Districts districts);

    public Iterable<Districts> save(Iterable<Districts> districts);

    public Districts update(Districts districts);

    public Iterable<Districts> update(Iterable<Districts> districts);

    public void delete(Districts districts);

    public void delete(Iterable<Districts> districts);

    public void deleteById(Integer id);

    public Districts getById(Integer id);

    public List<Districts> getAllByDeleted(@Param("isDeleted") boolean isDeleted);

}
