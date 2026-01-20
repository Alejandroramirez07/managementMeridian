package com.meridian.patterns.builder;

public class Client {
    private final String firstName;
    private final String lastName;
    private final int age;

    private Client(ClientBuilder builder){
        this.firstName=builder.firstName;
        this.lastName=builder.lastName;
        this.age=builder.age;
    }

    public static class ClientBuilder {
        private String firstName;
        private String lastName;
        private int age;

        public ClientBuilder(String firstName, String lastName){
            this.firstName=firstName;
            this.lastName=lastName;
        }

        public ClientBuilder age (int age){
            this.age=age;
            return this;
        }

        public Client build() {
            return new Client(this);
        }
    }
}


