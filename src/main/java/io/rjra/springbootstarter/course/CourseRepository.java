/**
 * 
 */
package io.rjra.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 * @author rodrigo
 *
 */
public interface CourseRepository extends CrudRepository<Course, String> {
	
	public List<Course> findByName(String name);
	
	public List<Course> findByDescription(String description);
	
	public List<Course> findByTopicId(String topicId);

}
