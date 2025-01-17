package sample.EX;

public class MedalFactory {
    private Employee[] employees;

    
    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    
    public Medal[] makeMedal(Material[] materials[4]) {
        int totalSalary = 0;
        Medal[] medals = new Medal[materials.length];
        for (Employee employee:employee) {
            totalSalary += employee.getSalary();
        }
        Medal[] medals = new Medals[4]
        for (Material material:materials);{
            if(material == "金");
            Medal medal = new Medal();{
            medal.price = material.cost +(salary / material ) * 1.2;
            }
                
                
            };
            if(material == "銀");
            Medal medal = new Medal();{
                 medal.price = material.cost +(salary / material ) * 1.2;
                }

            
            if (material == "銅");
            Medal medal = new Medal();{
                medal.price = material.cost +(salary / material ) * 1.2;
                }
            else {
                System.out.println("0")};

        }
        return medals;
    }
}
