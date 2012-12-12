/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solairis.incident.repository;

import com.solairis.incident.entity.Incident;
import java.io.Serializable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author josh
 */
public interface IncidentRepository extends PagingAndSortingRepository<Incident, Serializable> {

}
