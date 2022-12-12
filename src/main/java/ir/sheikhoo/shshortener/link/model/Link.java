package ir.sheikhoo.shshortener.link.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Link {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String originalLink;
    @Column
    private String shortLink;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private Integer visit;

}
