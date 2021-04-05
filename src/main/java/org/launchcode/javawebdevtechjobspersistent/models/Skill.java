package org.launchcode.javawebdevtechjobspersistent.models;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Skill extends AbstractEntity {
  private String description;

    @ManyToMany(mappedBy = "skills")
    private final List<Job> jobs = new ArrayList<>();


/*
    @Override
        public String getName () {
            return super.getName();
        }
        @Override
        public int getId () {
            return super.getId();
        }

        @NotBlank(message = "That's a negative ghost rider")
        @Size(min = 3, max = 500, message = "Name must be between 3 and 500 characters")

*/
        public Skill() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs(){
            return jobs;
    }
}

