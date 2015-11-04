package com.ifyouwannabecool.api;

import com.ifyouwannabecool.domain.persona.Persona;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Ryan Heaton
 */
@Getter @Setter
public class ExclusiveGroupException extends Exception {

  private String groupId;
  private Persona groupLeader;
}
