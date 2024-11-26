package com.job.application.practice;

import com.job.application.practice.model.Applicant;
import com.job.application.practice.model.Job;
import com.job.application.practice.service.ApplicantService;
import com.job.application.practice.service.JobService;

public class JobApplicationDemo {
    public static void main(String[] args) {
        System.out.println("Job Application");

        ApplicantService ap = new ApplicantService();
        Applicant a = ap.data();

        JobService js = new JobService();
        Job j = js.data();

        System.out.println("Applicant details" + a);
        System.out.println("Job Details " + j);
        System.out.println("==Thank You==");
    }
}
