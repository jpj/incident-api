/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solairis.incident.repository;

import com.solairis.incident.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author JanieBear
 */
public interface UserRepository extends PagingAndSortingRepository<User, String> {

	User findByLogin(String login);

}
