package com.job.application.practice.model;
import java.util.Date;

public class Job {
    public String title;
    public String description;

    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
