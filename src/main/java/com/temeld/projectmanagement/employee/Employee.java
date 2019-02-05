package com.temeld.projectmanagement.employee;

import com.temeld.projectmanagement.project.Project;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * @author duygutemel
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;

    @ManyToOne
    private Project project;

}
