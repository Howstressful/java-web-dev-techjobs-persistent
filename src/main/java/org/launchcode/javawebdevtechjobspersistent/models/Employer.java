package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.ArrayList;



@Entity
public class Employer extends AbstractEntity {

@NotBlank(message = "gonna need this to not be blank")
private String location;

@OneToMany
@JoinColumn
private List<Job> jobs = new ArrayList<>();
/*
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public int getId() {
        return super.getId();
    }

    @NotBlank(message = "That's a negative ghost rider")
    @Size(min = 3, max = 80, message = "Name must be between 3 and 80 characters")

*/

public Employer(){}

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public String getLocation(){
        return location;
    }
    public void setLocation(String location){
        this.location = location;
    }
}
