package com.ifyouwannabecool.domain.link;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Ryan Heaton
 */
@XmlRootElement
@Getter
@Setter
public class SocialGroup {

    private String id;
    private String[] memberIds;
    private String groupLeaderId;
    private boolean exclusive;
}
