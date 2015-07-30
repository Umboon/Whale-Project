/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.intenship.whale.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author oom
 */
@Entity
@Table(name = "DOCUMENT")
public class Document implements Serializable{
    
    @Id
    private Integer id;
    private Date dateReceived;
    private Date dateWork;
    private String agencyDocReleased;
    private String keywords;
    private String bookNO;
    private String topic;
    private String receiver;
    private String description;
    
    

}
