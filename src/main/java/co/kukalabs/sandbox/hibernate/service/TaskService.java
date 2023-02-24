package co.kukalabs.sandbox.hibernate.service;

import io.vertx.core.Future;
import co.kukalabs.sandbox.hibernate.model.TaskDTO;
import co.kukalabs.sandbox.hibernate.model.TasksList;

import java.util.Optional;

public interface TaskService {

  Future<TaskDTO> createTask (TaskDTO task);

  Future<TaskDTO> updateTask(TaskDTO task);

  Future<Optional<TaskDTO>> findTaskById (Integer id);

  Future<Void> removeTask (Integer id);

  Future<TasksList> findTasksByUser (Integer userId);
}
