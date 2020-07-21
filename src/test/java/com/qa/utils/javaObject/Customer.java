package com.qa.utils.javaObject;

public class Customer {
    private String gender;
    private String firstName;
    private String lastName;
    private String DOB;
    private String email;
    private String idNumber;
    private String expirationDate;
    private String phoneNumber;

    public Customer(String gender, String firstName, String lastName, String DOB, String email, String idNumber,String expirationD, String phoneNumber) {
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.email = email;
        this.idNumber = idNumber;
        this.expirationDate = expirationD;
        this.phoneNumber = phoneNumber;
    }

    public static class CustomerBuilder {
        private String gender;
        private String firstName;
        private String lastName;
        private String DOB;
        private String email;
        private String idNumber;
        private String expirationDate;
        private String phoneNumber;

        public CustomerBuilder(String gender, String firstName, String lastName, String DOB) {
            this.gender = gender;
            this.firstName = firstName;
            this.lastName = lastName;
            this.DOB = DOB;
        }

        public CustomerBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public CustomerBuilder withExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        public CustomerBuilder withIdNumber(String idNumber) {
            this.idNumber = idNumber;
            return this;
        }

        public CustomerBuilder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Customer build() {
            Customer customer
                    = new Customer(this.gender, this.firstName, this.lastName, this.DOB, this.email, this.idNumber,this.expirationDate, this.phoneNumber);
            validateCustomerObject(customer);
            return customer;
        }

        private void validateCustomerObject(Customer customer) {
            if (gender == null && lastName == null) {
                throw new IllegalArgumentException("Name can't be null when customer booking");
            }
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "gender='" + gender + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DOB='" + DOB + '\'' +
                ", email='" + email + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDOB() {
        return DOB;
    }

    public String getEmail() {
        return email;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
