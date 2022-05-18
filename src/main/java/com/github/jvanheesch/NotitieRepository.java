package com.github.jvanheesch;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotitieRepository extends CrudRepository<Notitie, Long> {
}
