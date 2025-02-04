package frc.robot.subsystems;

import edu.wpi.first.wpilibj.shuffleboard.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;


public class Telemetrysubsystem extends SubsystemBase {
    public Telemetrysubsystem() {}

    public void ConfigureDashboard() {

        Shuffleboard.getTab("Robot")
            .addBoolean("IsRotating", () -> DriveConstants.m_gyro.isRotating())
            .getType();
        Shuffleboard.getTab("Robot")
            .addFloat("Rotation Angle", () -> DriveConstants.m_gyro.getYaw())
            .getType();
    }
}