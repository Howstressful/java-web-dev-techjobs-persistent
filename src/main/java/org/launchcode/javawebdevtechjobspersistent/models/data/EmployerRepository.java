package org.launchcode.javawebdevtechjobspersistent.models.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.launchcode.javawebdevtechjobspersistent.models.Employer;


@Repository
public interface EmployerRepository extends CrudRepository <Employer, Integer> {
}
