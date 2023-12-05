package iterator

fun main() {
    val employee = Employee(
        "Juan", "CEO",
        Employee(
            "Pedro", "Presidente",
            Employee(
                "Liliana", "VP",
                Employee("Oscar", "Gerente", Employee("Mario", "Developer"),
                    Employee("Rodolfo", "Developer")
                ),
                Employee("Sofia", "Gerente", Employee("Adrián", "Sr Developer"),
                    Employee("Rebeca", "Developer")
                )
            )
        )
    )

    val empIterator: IIterator<Employee> = employee.createIterator()
    while (empIterator.hasNext()) {
        val emp = empIterator.next()
        println("emp > $emp")
    }
}
