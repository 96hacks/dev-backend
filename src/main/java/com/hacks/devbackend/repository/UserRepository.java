/**
 * 
 */
package com.hacks.devbackend.repository;

import org.springframework.data.repository.CrudRepository;
import com.hacks.devbackend.model.User;

/**
 * @author krish
 *
 */
public interface UserRepository extends CrudRepository<User, String>{

}
