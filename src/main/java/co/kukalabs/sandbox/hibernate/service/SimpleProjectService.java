package co.kukalabs.sandbox.hibernate.service;

import co.kukalabs.sandbox.hibernate.model.ProjectDTO;
import io.vertx.core.Future;
import co.kukalabs.sandbox.hibernate.model.ProjectsList;

import java.util.Optional;

public interface SimpleProjectService {

  Future<ProjectDTO> createProject (ProjectDTO projectDTO);

  Future<ProjectDTO> updateProject(ProjectDTO projectDTO);

  Future<Optional<ProjectDTO>> findProjectById (Integer id);

  Future<Void> removeProject (Integer id);

  Future<ProjectsList> findProjectsByUser (Integer userId);
}
