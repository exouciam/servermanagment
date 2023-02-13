package io.getarrays.server.repo;

import io.getarrays.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

// extends JPARepository to manage Server und handle type of Id (Long)
public interface ServerRepo extends JpaRepository<Server, Long> {

    // by extending JPARepository, it offers CRUD functionalities
    // construct methods so that they can be equivalent to certain sql queries
    Server findByIpAddress(String ipAddress);
    //Server findByName(String name);



}
