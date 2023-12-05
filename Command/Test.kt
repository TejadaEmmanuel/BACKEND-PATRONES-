package Command

fun main() {
    // Cliente (Usando el control remoto)
    val light = Light()
    val fan = Fan()

    val lightOnCommand = LightOnCommand(light)
    val lightOffCommand = LightOffCommand(light)
    val fanOnCommand = FanOnCommand(fan)
    val fanOffCommand = FanOffCommand(fan)

    val turnOnAllCommand = TurnOnAllCommand(listOf(lightOnCommand, fanOnCommand))
    val turnOffAllCommand = TurnOffAllCommand(listOf(lightOffCommand, fanOffCommand))

    val remote = RemoteControl()

    remote.addCommand(turnOnAllCommand)
    remote.pressButton()  // Enciende la luz y el ventilador

    remote.addCommand(turnOffAllCommand)
    remote.pressButton()  // Apaga la luz y el ventilador
}
