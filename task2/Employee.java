import java.util.ArrayList;
import java.util.List;

public class Employee{
    private String name;
    private String department;
    private List<Role> roles;

    public Employee(String name, String department, Role initialRole){
        this.name = name;
        this.department = department;
        this.roles = new ArrayList<>();
        this.roles.add(initialRole);
    }
    public String name(){ return name; }
    public String department(){ return department; }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" at ");
        sb.append(department);
        sb.append(" with roles ");
        for(Role role: roles) {
            sb.append(role.getName());
        }

        return sb.toString();
    }

    public void addRole(Role newRole) {
        roles.add(newRole);
    }

    public void removeRole(Role roleToRemove) {
        try {
            roles.remove(roleToRemove);
        } catch ( NullPointerException e) {
            System.out.println("could not find role to remove");
        }

    }
}