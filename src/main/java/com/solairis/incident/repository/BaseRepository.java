/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solairis.incident.repository;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author josh
 */
public interface BaseRepository<T, ID extends Serializable> extends PagingAndSortingRepository<T, ID> {

}
