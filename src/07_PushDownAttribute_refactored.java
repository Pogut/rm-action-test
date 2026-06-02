public class PersonRecord {
    protected String name;

    public PersonRecord(String name) {
        this.name = name;
    }
}

class EmployeeRecord extends PersonRecord {
    protected String employeeId;

    public EmployeeRecord(String name, String employeeId) {
        super(name);
        this.employeeId = employeeId;
    }
}

class CustomerRecord extends PersonRecord {
    public CustomerRecord(String name) {
        super(name);
    }
}
