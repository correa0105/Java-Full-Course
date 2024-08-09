package entities;

import enums.WorkerLevel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<Contract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(Department department, String name, Double baseSalary, WorkerLevel level) {
        this.department = department;
        this.name = name;
        this.baseSalary = baseSalary;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartament() {
        return department;
    }

    public void setDepartament(Department department) {
        this.department = department;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

    public void addContract(Contract contract) {
        contracts.add(contract);
    }

    public void removeContract(Contract contract) {
        contracts.remove(contract);
    }

    public double income(int month, int year) {
        double sum = baseSalary;
        for (Contract contract : contracts) {
            LocalDate contractDate = contract.getDate();
            int contractYear = contractDate.getYear();
            int contractMonth = contractDate.getMonthValue();
            if (year == contractYear && month == contractMonth) {
                sum += contract.totalValue();
            }
        }
        return sum;
    }
}
