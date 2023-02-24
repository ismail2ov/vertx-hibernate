package co.kukalabs.sandbox.hibernate.service;

import co.kukalabs.sandbox.hibernate.model.ProjectDTO;
import io.vertx.core.Future;
import co.kukalabs.sandbox.hibernate.auth.Principal;
import co.kukalabs.sandbox.hibernate.model.ProjectsList;

import java.util.Optional;

public interface ProjectService {

  Future<ProjectDTO> createProject (ProjectDTO projectDTO);

  Future<ProjectDTO> updateProject(Principal principal, ProjectDTO projectDTO);

  Future<Optional<ProjectDTO>> findProjectById (Integer id);

  Future<Void> removeProject (Principal principal, Integer id);

  Future<ProjectsList> findProjectsByUser (Integer userId);
}
