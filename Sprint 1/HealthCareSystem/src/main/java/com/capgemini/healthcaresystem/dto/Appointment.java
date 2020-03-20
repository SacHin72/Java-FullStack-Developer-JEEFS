package com.capgemini.healthcaresystem.dto;
import java.math.BigInteger;
import java.time.LocalDateTime;

public class Appointment {

        User user;
        BigInteger appointmentId;
        DiagnosticTest test;
        LocalDateTime datetime;
        boolean approved;
        
        // Constructor
        
        public Appointment(User user, BigInteger appointmentId, DiagnosticTest test, LocalDateTime datetime, boolean approved) {
                super();
                this.user = user;
                this.appointmentId = appointmentId;
                this.test = test;
                this.datetime = datetime;
                this.approved = approved;
        }
        
        // Getters and Setters
        
        public User getUser() {
                return user;
        }

        public BigInteger getAppointmentId() {
                return appointmentId;
        }

        public DiagnosticTest getTest() {
                return test;
        }
        public LocalDateTime getDatetime() {
                return datetime;
        }

        public boolean isApproved() {
                return approved;
        }    
        public void setApproved(boolean value) {
            this.approved=value;
    } 
}