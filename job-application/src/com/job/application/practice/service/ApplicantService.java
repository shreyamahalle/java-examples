package com.job.application.practice.service;

import com.job.application.practice.model.Applicant;

import java.util.Scanner;

public class ApplicantService {

    public Applicant data(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name ");
        String name = sc.nextLine();
        System.out.println("enter the emailId ");
        String emailId = sc.nextLine();
        System.out.println("enter the resume ");
        String resume = sc.nextLine();
        System.out.println("enter the skills ");
        String skills = sc.nextLine();

        Applicant a = new Applicant();
        a.name = name;
        a.emailId = emailId;
        a.resume = resume;
        a.skills = skills;

        return a;
    }
}
