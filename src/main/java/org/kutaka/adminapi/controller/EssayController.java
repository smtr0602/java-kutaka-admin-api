package org.kutaka.adminapi.controller;

import java.util.Map;
import java.util.TreeMap;
import org.kutaka.adminapi.service.EssayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EssayController {

  @Autowired
  private EssayService essayService;

  @GetMapping("/essays")
  public TreeMap<String, Object> getEssays(@RequestParam Map<String, String> params) {
    return essayService.getEssays(params);
  }
}
