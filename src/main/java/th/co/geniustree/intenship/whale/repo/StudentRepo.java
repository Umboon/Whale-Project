/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.intenship.whale.repo;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import th.co.geniustree.intenship.whale.model.Student;

/**
 *
 * @author oom
 */
public interface StudentRepo extends JpaRepository<Student, Integer>{
    
}
