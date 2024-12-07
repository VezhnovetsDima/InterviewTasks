package org.example.write_method.generics_1;

public class Make_constructor {

    public static class Task<T> {
        private int id;

        public Task() {
            System.out.println("?");
        }

        public int getid() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Task<String> task = new Task<String>();
    }
}