package com.solairis.incident;

import com.solairis.incident.entity.Incident;
import com.solairis.incident.repository.IncidentRepository;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Unit test for simple App.
 */
@ContextConfiguration(locations={"classpath:spring-config.xml"})
public class AppTest
	extends AbstractJUnit4SpringContextTests {

	@Resource
	private IncidentRepository incidentRepository;

	@Test
	public void test() {

		Incident incident = new Incident(new Date(), "Other Cow");
		incidentRepository.save(incident);
		System.out.println("GOT IT "+incident.getId());
		List<Incident> findByLabelIgnoreCaseOrderByLabelDesc = incidentRepository.findByLabelLikeOrderByLabelAsc("Other");

		System.out.println("RETURNED "+findByLabelIgnoreCaseOrderByLabelDesc.size());

		for (Incident i1 : findByLabelIgnoreCaseOrderByLabelDesc) {
			System.out.println("\tFOUND "+i1.getId()+" "+i1.getLabel());
		}

	}
}
