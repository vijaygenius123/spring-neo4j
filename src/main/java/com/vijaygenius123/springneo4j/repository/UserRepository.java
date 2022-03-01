package com.vijaygenius123.springneo4j.repository;

import com.vijaygenius123.springneo4j.model.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;

import java.util.Collection;

public interface UserRepository extends Neo4jRepository<User, Long> {

    @Query("MATCH (u:USER)<-[r:RATED]-(m:MOVIE) RETURN u,r,m")
    Collection<User> getAllUsers();
}
