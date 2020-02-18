
package com.capgemini.healthcaresystem.dto;

import java.math.BigInteger;
import java.util.List;

public class User {
        private String userName, emailId, contactNo;
        private List<DiagnosticCenter> centerList;
        
        public User( String userName, String emailId,String contactNo) {
                this.userName = userName;
                this.emailId = emailId;
                this.contactNo = contactNo;
        }
        
        public String getUserName() {
                return userName;
        }

        public String getEmailId() {
                return emailId;
        }

        public String getContactNo() {
                return contactNo;
        }
}