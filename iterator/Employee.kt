package iterator
import iterator.impl.IContainer
import java.util.*

class Employee(role: String, puesto: String, vararg subordinates: Employee) : IContainer<Employee> {

    private var name: String = role
    private var role: String = puesto
    private var subordinates: MutableList<Employee> = subordinates.asList() as MutableList<Employee>

    override fun createIterator(): IIterator<Employee> {
        return TreeEmployeeIterator()
    }

    private inner class TreeEmployeeIterator : IIterator<Employee> {

        private var list = LinkedList<Employee>()
        private var index = 0

        init {
            addRecursive(this@Employee)
        }

        private fun addRecursive(employee: Employee) {
            list.add(employee)
            employee.subordinates.forEach {
                addRecursive(it)
            }
        }

        override fun hasNext(): Boolean {
            return index < list.size
        }

        override fun next(): Employee {
            if (!hasNext()) {
                throw RuntimeException("No hay más elementos")
            }
            return list[index++]
        }
    }

    fun setSubordinates(subordinates: MutableList<Employee>) {
        this.subordinates = subordinates
    }

    fun addSubordinate(subordinate: Employee) {
        subordinates = ArrayList(this.subordinates)
        subordinates.add(subordinate)
    }

    override fun toString(): String {
        return "Employee{name='$name', role='$role'}"
    }
    /** GET and SET */
}