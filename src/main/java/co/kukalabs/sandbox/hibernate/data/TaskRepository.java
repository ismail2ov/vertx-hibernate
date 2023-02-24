package co.kukalabs.sandbox.hibernate.data;

import co.kukalabs.sandbox.hibernate.model.TaskDTO;
import io.vertx.core.Future;
import co.kukalabs.sandbox.hibernate.model.TasksList;

import java.util.Optional;

public interface TaskRepository {

  Future<TaskDTO> createTask (TaskDTO task);

  Future<TaskDTO> updateTask (TaskDTO task);

  Future<Void> removeTask (Integer id);

  Future<Optional<TaskDTO>> findTaskById (Integer id);

  Future<TasksList> findTasksByUser (Integer userId);
}
