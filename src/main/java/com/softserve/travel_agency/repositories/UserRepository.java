package com.softserve.travel_agency.repositories;

import com.softserve.travel_agency.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
