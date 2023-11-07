package io.aiven.spring.mysql.demo;

import org.springframework.data.repository.CrudRepository;


public interface userRepository extends CrudRepository<user, Integer> {

}
