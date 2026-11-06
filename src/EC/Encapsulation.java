package EC;

/**
 * ============================================================================
 * CLASS: Encapsulation
 * ============================================================================
 * Description:
 *   Demonstrates basic OOP Encapsulation with private field protection, getter,
 *   setter, and a standalone main execution method.
 * 
 * Concepts Demonstrated:
 *   - Private fields: `name`, `mobileNo`
 *   - Getter and Setter encapsulation contracts
 * ============================================================================
 */
public class Encapsulation {
    private String name = "Shivu";
    private long mobileNo = 20025L;

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

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        System.out.println("========== Direct Encapsulation Demo ==========");
        System.out.println("Initial Name      : " + obj.getName());
        System.out.println("Initial Mobile No : " + obj.getMobileNo());

        obj.setName("Shivu - Updated");
        System.out.println("Updated Name      : " + obj.getName());
    }
}
