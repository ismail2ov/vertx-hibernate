package co.kukalabs.sandbox.hibernate.data;

import co.kukalabs.sandbox.hibernate.model.ProjectDTO;
import co.kukalabs.sandbox.hibernate.model.Project;

import java.util.function.Function;

class ProjectDTOMapper implements Function<Project, ProjectDTO> {

  @Override
  public ProjectDTO apply(Project project) {
    return new ProjectDTO(project.getId(), project.getUserId(), project.getName());
  }
}
