package com.semi.repositories;

import com.semi.models.Task;
import com.semi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Date 21.05.2018
 *
 * @author Hursanov Sulaymon
 * @version v1.0
 **/
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findAllByUser(User user);
}
