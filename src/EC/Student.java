package EC;

/**
 * ============================================================================
 * CLASS: Student
 * ============================================================================
 * Description:
 *   Demonstrates Data Encapsulation in Java by hiding field data using `private`
 *   access modifiers and providing `public` getters and setters.
 * 
 * Inter-connectivity:
 *   Student (Encapsulated Bean Model)
 *     ^
 *     |-- StudentUser (Driver class accessing Student via Getters/Setters)
 * 
 * Concepts Demonstrated:
 *   - Data Hiding (`private String name`, `private long mobileNo`)
 *   - Accessor methods (`getName()`, `getMobileNo()`)
 *   - Mutator methods (`setName()`, `setMobileNo()`)
 * ============================================================================
 */
public class Student {
    // Private member variables (Encapsulation)
    private String name;
    private long mobileNo;

    /**
     * Default Constructor
     */
    public Student() {
        this.name = "Default Student";
        this.mobileNo = 9999999999L;
    }

    /**
     * Parameterized Constructor
     * @param name Student Name
     * @param mobileNo Mobile Number
     */
    public Student(String name, long mobileNo) {
        this.name = name;
        this.mobileNo = mobileNo;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * Helper method to print student details.
     */
    public void displayStudentDetails() {
        System.out.println("========== Student Information ==========");
        System.out.println("Student Name  : " + name);
        System.out.println("Mobile Number : " + mobileNo);
        System.out.println("----------------------------------------");
    }
}
