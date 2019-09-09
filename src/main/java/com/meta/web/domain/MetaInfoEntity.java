package com.meta.web.domain;

import javax.persistence.*;

@Entity
@Table(name = "META_INFO")
public class MetaInfoEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "META_NAME")
    private String metaName;

    @Column(name="IDENTITY")
    private boolean indentity;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMetaName() {
        return metaName;
    }

    public void setMetaName(String metaName) {
        this.metaName = metaName;
    }

    public boolean isIndentity() {
        return indentity;
    }

    public void setIndentity(boolean indentity) {
        this.indentity = indentity;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public MetaInfoEntity() {
    }

    public MetaInfoEntity(String metaName, boolean indentity, String firstName, String lastName) {
        this.metaName = metaName;
        this.indentity = indentity;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
