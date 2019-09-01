/**
 * 
 */
package com.hacks.devbackend.repository;

import org.springframework.data.repository.CrudRepository;
import com.hacks.devbackend.model.Comment;

/**
 * @author krish
 *
 */
public interface CommentRepository extends CrudRepository<Comment, Integer>{

}
