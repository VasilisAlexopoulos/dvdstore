package model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Data
@Builder
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class Movie extends BaseEntity{
    private String title;
    private Category category;
    private String director;
    private Date releaseDate;
    private String summaryDescr;
    private List<String> actors;
}
