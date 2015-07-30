/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.intenship.whale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import th.co.geniustree.intenship.whale.model.Authority;
import th.co.geniustree.intenship.whale.repo.AuthorityRepo;

/**
 *
 * @author oom
 */
@RestController
public class AuthorityController {
    @Autowired
    private AuthorityRepo authorityRepo;
    
    
   
    @RequestMapping(value = "/authority")
    public Page<Authority> getStudents(Pageable pageable){
        return authorityRepo.findAll(pageable);
        
    }
    
}
