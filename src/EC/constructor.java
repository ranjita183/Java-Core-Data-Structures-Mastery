package EC;

/**
 * ============================================================================
 * CLASS: constructor
 * ============================================================================
 * Description:
 *   Demonstrates Parameterized Constructors, Instance Variables vs Static Variables.
 * 
 * Concepts Demonstrated:
 *   - Static Member (`static char section = 'B'`) shared by all objects
 *   - Parameterized Constructor initializing instance fields (`name`, `mobileNo`)
 *   - Object state initialization and display
 * ============================================================================
 */
public class constructor {
    // Static field shared by all students
    public static char section = 'B';
    
    // Instance fields unique to each object
    private String name;
    private long mobileNo;

    /**
     * Parameterized Constructor
     * @param name Name of student
     * @param mobileNo Mobile number of student
     */
    public constructor(String name, long mobileNo) {
        this.name = name;
        this.mobileNo = mobileNo;
    }

    /**
     * Display student details including shared section.
     */
    public void displayStudentDetails() {
        System.out.println("Student Name  : " + name);
        System.out.println("Mobile Number : " + mobileNo);
        System.out.println("Section       : " + section);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        System.out.println("========== Constructor & Field Demo ==========");
        constructor c1 = new constructor("Shivu", 1111111111L);
        c1.displayStudentDetails();

        constructor c2 = new constructor("Sharath", 2222222222L);
        c2.displayStudentDetails();

        constructor c3 = new constructor("Manoj", 3333333333L);
        c3.displayStudentDetails();
    }
}
