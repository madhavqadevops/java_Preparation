package javaPrep;

class Employee {
    private String firstName = null;
    private String lastName  = null;
    private int    birthYear = 0;

    public static void main(String[] args) {
        Employee employee=new Employee("MA", "AV", 12);

        System.out.println(employee.birthYear);

    }
        public Employee(String firstName,
                        String lastName,
                        int    birthYear ) {

            firstName = firstName;
            lastName  = lastName;
            birthYear = birthYear;
        }

    }

