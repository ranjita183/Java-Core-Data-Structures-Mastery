package EC;

/**
 * ============================================================================
 * CLASS: StudentUser
 * ============================================================================
 * Description:
 *   Driver application demonstrating instantiation, getter access, and setter
 *   mutation of the encapsulated `Student` class.
 * 
 * Inter-connectivity:
 *   StudentUser ---> Student (Instantiates and mutates Student records)
 * ============================================================================
 */
public class StudentUser {
    public static void main(String[] args) {
        System.out.println("========== Encapsulation Demo (Student) ==========");
        
        // 1. Create student instance using parameterized constructor
        Student s1 = new Student("Shivu", 9876543210L);
        s1.displayStudentDetails();

        // 2. Modify student details using Setters
        System.out.println("Updating student information via setters...");
        s1.setName("Shivakumar");
        s1.setMobileNo(9123456789L);

        // 3. Retrieve student details using Getters
        System.out.println("Retrieved Name via Getter     : " + s1.getName());
        System.out.println("Retrieved Mobile via Getter   : " + s1.getMobileNo());
    }
}
