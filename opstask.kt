fun main(){
    val emp =Employee(22, "ABC",10000,31)
    emp.display()
    val emp1=emp.calculatePerDaySalary(emp.empSalary)
    val emp2=emp.totalSalaryEarned(emp.noOfDaysPresent,emp.empSalary)
    println("per day salary : $emp1")
    println("total salary: $emp2")
}

class Employee(var empId: Int, var empName: String, var empSalary: Int,var noOfDaysPresent:Int) {

    fun display() {
        println("$empId , $empName,$empSalary,$noOfDaysPresent")
    }

    fun calculatePerDaySalary(empSalary: Int): Int {
        return empSalary / 30
    }

    fun totalSalaryEarned(noOfDaysPresent: Int, empSalary: Int): Int {
        val result = noOfDaysPresent * calculatePerDaySalary(empSalary)
        return result
    }
}