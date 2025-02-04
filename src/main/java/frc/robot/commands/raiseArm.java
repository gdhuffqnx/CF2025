package frc.robot.commands;

import frc.robot.subsystems.armExtend;
import edu.wpi.first.wpilibj2.command.Command;


public class raiseArm extends Command {
    private final armExtend armSubsystem;

    private final double speed;

    public raiseArm(armExtend armSubsystem, double speed) {
        this.armSubsystem = armSubsystem;
        this.speed = speed;
        addRequirements(armSubsystem); // Ensures that the arm subsystem is required for this command
    }

    @Override
    public void execute() {
        armSubsystem.moveArm(speed);
    }

    @Override
    public void end(boolean interrupted) {
        armSubsystem.stopArm();
    }

    @Override
    public boolean isFinished() {
        return false; // If you want it to be continuous, return false
    }
}
