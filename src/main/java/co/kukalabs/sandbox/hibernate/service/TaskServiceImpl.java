package co.kukalabs.sandbox.hibernate.service;

import io.vertx.core.Future;
import co.kukalabs.sandbox.hibernate.data.TaskRepository;
import co.kukalabs.sandbox.hibernate.model.TaskDTO;
import co.kukalabs.sandbox.hibernate.model.TasksList;

import java.util.Optional;

public record TaskServiceImpl(TaskRepository repository) implements TaskService {

  @Override
  public Future<TaskDTO> createTask(TaskDTO task) {
    return repository.createTask(task);
  }

  @Override
  public Future<TaskDTO> updateTask(TaskDTO task) {
    return repository.updateTask(task);
  }

  @Override
  public Future<Optional<TaskDTO>> findTaskById(Integer id) {
    return repository.findTaskById(id);
  }

  @Override
  public Future<Void> removeTask(Integer id) {
    return repository.removeTask(id);
  }

  @Override
  public Future<TasksList> findTasksByUser(Integer userId) {
    return repository.findTasksByUser(userId);
  }
}
