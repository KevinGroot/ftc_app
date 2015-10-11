package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Kevin on 11/10/2015.
 */
public class MyFirstOp extends OpMode
{

    DcMotor rightMotor;

    public void init()
    {
        rightMotor = hardwareMap.dcMotor.get("motor_1");
    }

    public void loop()
    {

    }
}
