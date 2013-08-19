/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solairis.incident.repository;

import com.solairis.incident.entity.IncidentHistory;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author josh
 */
public interface IncidentHistoryRepository extends PagingAndSortingRepository<IncidentHistory, String> {

}
