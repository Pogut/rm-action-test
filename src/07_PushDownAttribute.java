public class PersonRecord {
    protected String name;
    protected String employeeId;

    public PersonRecord(String name) {
        this.name = name;
    }
}

class EmployeeRecord extends PersonRecord {
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
