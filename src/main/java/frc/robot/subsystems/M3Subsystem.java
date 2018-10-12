/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * A subsystem to control Motor 3 in the case.
 */
public class M3Subsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private WPI_TalonSRX m_talon;

  public M3Subsystem() {
    m_talon = new WPI_TalonSRX(3);
    m_talon.set(ControlMode.PercentOutput, 0.0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new M3UpdateCommand());
  }

  public void setPower(double power) {
    m_talon.set(ControlMode.PercentOutput, power);
    SmartDashboard.putNumber("M3 Power", power);

  }

  public void stop() {
    m_talon.set(ControlMode.PercentOutput, 0.0);
    SmartDashboard.putNumber("M3 Power", 0.0);
  }
};
