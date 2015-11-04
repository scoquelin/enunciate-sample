package com.ifyouwannabecool.domain.persona;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.Builder;

/**
 * @author Ryan Heaton
 */
@XmlRootElement
@Data
@Builder
public class Persona {

    private String id;
    private String email;
    private String alias;
    private String[] groups;
    private Name name;
    private javax.activation.DataHandler picture;
}
