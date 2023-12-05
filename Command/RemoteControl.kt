package Command

// Invocador (Control Remoto)
class RemoteControl {
    private val commands = mutableListOf<Command>()

    fun addCommand(command: Command) {
        commands.add(command)
    }

    fun pressButton() {
        commands.forEach { it.execute() }
        commands.clear()
    }
}
