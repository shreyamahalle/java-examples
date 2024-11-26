package com.job.application.practice.service;

import com.job.application.practice.model.Applicant;
import com.job.application.practice.model.Job;

import java.util.Date;
import java.util.Scanner;

public class JobService {
    public Job data(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the title ");
        String title = sc.nextLine();
        System.out.println("enter the description ");
        String description = sc.nextLine();

        Job j = new Job();
        j.title = title;
        j.description = description;

        return j;
    }
}
