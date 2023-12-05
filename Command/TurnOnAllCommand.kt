package Command

// Comando Compuesto para encender varios dispositivos a la vez
class TurnOnAllCommand(private val commands: List<Command>) : Command {
    override fun execute() {
        commands.forEach { it.execute() }
    }
}

// Comando Compuesto para apagar varios dispositivos a la vez
class TurnOffAllCommand(private val commands: List<Command>) : Command {
    override fun execute() {
        commands.forEach { it.execute() }
    }
}
