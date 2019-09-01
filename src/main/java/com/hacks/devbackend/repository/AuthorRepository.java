/**
 * 
 */
package com.hacks.devbackend.repository;

import org.springframework.data.repository.CrudRepository;
import com.hacks.devbackend.model.Author;

/**
 * @author krish
 *
 */
public interface AuthorRepository extends CrudRepository<Author, Integer>{

}
