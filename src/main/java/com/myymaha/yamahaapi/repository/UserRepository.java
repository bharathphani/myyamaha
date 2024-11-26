package com.myymaha.yamahaapi.repository;

import com.myymaha.yamahaapi.entity.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface  UserRepository extends JpaRepository<User, Long> {
    //derived name methods based on names spring will write queries
 Optional<User> findByMobileNo(String mobileNo);
 Optional<User> findByMobileNoAndEmail(String mobileNo, String email);
}
