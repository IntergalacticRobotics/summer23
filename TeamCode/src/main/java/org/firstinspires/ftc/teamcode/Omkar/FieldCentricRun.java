package org.firstinspires.ftc.teamcode.Omkar;


import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp
public class FieldCentricRun extends LinearOpMode {

    FieldCentricDriveTrain drive; // object of the field centric with old imu

    @Override
    public void runOpMode() {
        drive = new FieldCentricDriveTrain(hardwareMap, gamepad1, telemetry);
        waitForStart();
        while(opModeIsActive()) {
            drive.loop();
        }

    }

}

