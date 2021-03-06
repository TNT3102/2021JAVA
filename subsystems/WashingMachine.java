// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class WashingMachine extends SubsystemBase {
  CANSparkMax Wash = new CANSparkMax(2, MotorType.kBrushed);
  /** Creates a new WashingMachine. */
  public WashingMachine() {
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void set(double speed){
    Wash.set(speed);
  }
}