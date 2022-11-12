package com.elsior.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @PROJECT mvn-parent
 * @Author Elimane on 11/11/2022
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {
  @Id
  private Long id;

  private String name;
  private int age;
}
