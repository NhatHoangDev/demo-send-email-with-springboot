package com.example.demosendemail;

import com.sun.istack.internal.NotNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

public class Feedback {
    @NotNull
    private String name;
    @NotNull
    @Email
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    @NotNull
    @Min(10)
    private String feedback;
}
