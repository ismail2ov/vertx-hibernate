package co.kukalabs.sandbox.hibernate.data;

import co.kukalabs.sandbox.hibernate.model.Project;
import co.kukalabs.sandbox.hibernate.model.ProjectDTO;

import java.util.function.Function;

class ProjectEntityMapper implements Function<ProjectDTO, Project> {

  @Override
  public Project apply(ProjectDTO projectDTO) {
    Project entity = new Project();
    entity.setId(projectDTO.id());
    entity.setUserId(projectDTO.userId());
    entity.setName(projectDTO.name());
    return entity;
  }
}
