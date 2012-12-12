/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solairis.incident.repository;

import com.solairis.incident.entity.Incident;
import java.util.List;

/**
 *
 * @author josh
 */
public interface IncidentRepository extends BaseRepository<Incident, String> {

	List<Incident> findByLabelLikeOrderByLabelAsc(String label);

}
