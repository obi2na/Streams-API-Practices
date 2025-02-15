package com.github.streams.interview.employee.domain_related;

import java.util.Collection;

public record Employee(
    int employeeId,
    Identity identity,
    long salary,
    Department department,
    Collection<Project> projects,
    long managerId) {
  public long totalProjectDurations() {
    return projects.stream().mapToInt(Project::projectDurationInMonths).sum();
  }

  public long projectSize() {
    return this.projects().size();
  }
}
