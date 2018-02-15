package com.zisal.springbootmongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created on 2/15/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
