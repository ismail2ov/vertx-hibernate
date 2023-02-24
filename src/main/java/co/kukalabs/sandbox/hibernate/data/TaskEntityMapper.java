package co.kukalabs.sandbox.hibernate.data;

import co.kukalabs.sandbox.hibernate.model.Project;
import co.kukalabs.sandbox.hibernate.model.Task;
import co.kukalabs.sandbox.hibernate.model.TaskDTO;

import java.util.function.Function;

class TaskEntityMapper implements Function<TaskDTO, Task> {
  @Override
  public Task apply(TaskDTO taskDTO) {
    Task task = new Task();
    task.setId(taskDTO.id());
    task.setUserId(taskDTO.userId());
    task.setContent(taskDTO.content());
    task.setCompleted(taskDTO.completed());
    task.setCreatedAt(taskDTO.createdAt());
    ProjectEntityMapper projectEntityMapper = new ProjectEntityMapper();
    if (taskDTO.project().isPresent()){
      Project project = projectEntityMapper.apply(taskDTO.project().get());
      task.setProject(project);
    } else {
      task.setProject(null);
    }
    return task;
  }
}
