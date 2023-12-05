package Command

// Comando Concreto para encender la luz
class LightOnCommand(private val light: Light) : Command {
    override fun execute() {
        light.turnOn()
    }
}

// Comando Concreto para apagar la luz
class LightOffCommand(private val light: Light) : Command {
    override fun execute() {
        light.turnOff()
    }
}

// Comando Concreto para encender el ventilador
class FanOnCommand(private val fan: Fan) : Command {
    override fun execute() {
        fan.turnOn()
    }
}

// Comando Concreto para apagar el ventilador
class FanOffCommand(private val fan: Fan) : Command {
    override fun execute() {
        fan.turnOff()
    }
}
