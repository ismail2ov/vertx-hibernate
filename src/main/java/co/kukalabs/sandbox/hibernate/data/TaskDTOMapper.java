package co.kukalabs.sandbox.hibernate.data;

import co.kukalabs.sandbox.hibernate.model.ProjectDTO;
import co.kukalabs.sandbox.hibernate.model.Task;
import co.kukalabs.sandbox.hibernate.model.TaskDTO;

import java.util.Optional;
import java.util.function.Function;

class TaskDTOMapper implements Function<Task, TaskDTO> {
  @Override
  public TaskDTO apply(Task task) {
    ProjectDTOMapper mapper = new ProjectDTOMapper();
    Optional<ProjectDTO> project = null;
    if (task.getProject() != null) {
      project = Optional.ofNullable(mapper.apply(task.getProject()));
    } else {
      project = Optional.empty();
    }

    return new TaskDTO(task.getId(), task.getUserId(), task.getContent(), task.isCompleted(), task.getCreatedAt(), project);
  }
}
