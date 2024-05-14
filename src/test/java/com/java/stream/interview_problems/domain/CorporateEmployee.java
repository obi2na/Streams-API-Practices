package com.java.stream.interview_problems.domain;

import java.util.List;

public record CorporateEmployee(int id, String name, List<Project> projects) {
  public long sumOfProjectDurations() {
    return projects.stream().mapToInt(Project::duration).sum();
  }

  public long projectSize() {
    return this.projects().size();
  }
}
