package org.example.write_method.generics_1;

public class Make_constructor_solution {
    public static class Task<T> {
        private int id;
        private Class<?> clazz;

        public Task(Class<?> clazz) {
            this.clazz = clazz;
            System.out.println(clazz.getName());
        }

        public int getid() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

    public static void main(String[] args) {
        Make_constructor_solution.Task<String> task = new Make_constructor_solution.Task<String>(String.class);
    }
}