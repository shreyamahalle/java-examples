package com.job.application.practice.model;

public class Applicant {
    public String name;
    public String emailId;
    public String resume;
    public  String coverLetter;
    public String skills;

    @Override
    public String toString() {
        return "Applicant{" +
                "name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", resume='" + resume + '\'' +
                ", coverLetter='" + coverLetter + '\'' +
                ", skills='" + skills + '\'' +
                '}';
    }
}
