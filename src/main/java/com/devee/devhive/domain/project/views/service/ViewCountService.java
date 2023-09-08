package com.devee.devhive.domain.project.views.service;

import com.devee.devhive.domain.project.entity.Project;
import com.devee.devhive.domain.project.views.entity.ViewCount;
import com.devee.devhive.domain.project.views.repository.ViewCountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ViewCountService {

  private final ViewCountRepository viewCountRepository;

  public void incrementViewCount(Project project) {
    ViewCount viewCount = project.getViewCount();
    if (viewCount == null) {
      viewCount = new ViewCount();
      viewCount.setProject(project);
    }
    viewCount.incrementCount();
    viewCountRepository.save(viewCount);
  }
}
