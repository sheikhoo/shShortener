package ir.sheikhoo.shshortener.links.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Links {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String orginalLink;
    @Column
    private String shortLink;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private Integer visit;

    public Links() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrginalLink() {
        return orginalLink;
    }

    public void setOrginalLink(String orginalLink) {
        this.orginalLink = orginalLink;
    }

    public String getShortLink() {
        return shortLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getVisit() {
        return visit;
    }

    public void setVisit(Integer visit) {
        this.visit = visit;
    }
}
