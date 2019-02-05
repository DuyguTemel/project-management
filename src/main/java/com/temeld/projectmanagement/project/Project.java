package com.temeld.projectmanagement.project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author duygutemel
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Project implements Serializable {

    @Id
    @GeneratedValue
    Long id;
    String name;
    String description;

}
