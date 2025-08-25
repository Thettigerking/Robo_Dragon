package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "RoboDragonsnew2025")
public class RoboDragons extends LinearOpMode {
    private DcMotor driveleft;
    private DcMotor driveright;
    private DcMotor claw2;
    private DcMotor tower2;
    private DcMotor tower;
    private CRServo clawcontrol;
    private CRServo intake;

    @Override
    public void runOpMode() {
        driveleft = hardwareMap.get(DcMotor.class, "drive left");
        driveright = hardwareMap.get(DcMotor.class, "drive right");
        claw2 = hardwareMap.get(DcMotor.class, "claw 2");
        tower2 = hardwareMap.get(DcMotor.class, "tower 2");
        tower = hardwareMap.get(DcMotor.class, "tower");
        clawcontrol = hardwareMap.get(CRServo.class, "clawcontrol");
        intake = hardwareMap.get(CRServo.class, "intake");

        // Put initialization blocks here.
        waitForStart();
        if (opModeIsActive()) {
            // Put run blocks here.
            while (opModeIsActive()) {
                if (gamepad1.left_stick_y != 0) {
                    driveleft.setPower(gamepad1.left_stick_y);
                    driveright.setPower(-(gamepad1.left_stick_y));
                }
                if (gamepad1.left_stick_x != 0) {
                    driveleft.setPower(gamepad1.left_stick_x);
                    driveright.setPower(gamepad1.left_stick_x);
                }
                if (gamepad1.left_stick_x == 0 && gamepad1.left_stick_y == 0) {
                    driveleft.setPower(0);
                    driveright.setPower(0);
                }
                if (gamepad1.dpad_up) {
                    claw2.setPower(-1);
                }
                if (gamepad1.dpad_down) {
                    claw2.setPower(1);
                }
                if (!(gamepad1.dpad_down && gamepad1.dpad_up)) {
                    claw2.setPower(-0.05);
                }
                if (gamepad1.left_bumper) {
                    tower2.setPower(-1);
                    tower.setPower(1);
                }
                if (gamepad1.right_bumper) {
                    tower2.setPower(1);
                    tower.setPower(-1);
                }
                if (!(gamepad1.left_bumper && gamepad1.right_bumper)) {
                    tower2.setPower(0.05);
                    tower.setPower(0);
                }
                if (gamepad1.a) {
                    clawcontrol.setPower(1);
                    sleep(500);
                    clawcontrol.setPower(0.001);
                }
                if (gamepad1.y) {
                    clawcontrol.setPower(-1);
                    sleep(500);
                    clawcontrol.setPower(-0.1);
                }
                if (gamepad1.x) {
                    intake.setPower(1);
                }
                if (gamepad1.b) {
                    intake.setPower(-1);
                }



                if (gamepad2.left_stick_y != 0) {
                    driveleft.setPower(gamepad2.left_stick_y);
                    driveright.setPower(-(gamepad2.left_stick_y));
                }
                if (gamepad2.left_stick_x != 0) {
                    driveleft.setPower(gamepad2.left_stick_x);
                    driveright.setPower(gamepad2.left_stick_x);
                }
                if (gamepad2.left_stick_x == 0 && gamepad2.left_stick_y == 0) {
                    driveleft.setPower(0);
                    driveright.setPower(0);
                }
                if (gamepad2.dpad_up) {
                    claw2.setPower(-1);
                }
                if (gamepad2.dpad_down) {
                    claw2.setPower(1);
                }
                if (!(gamepad2.dpad_down && gamepad2.dpad_up)) {
                    claw2.setPower(-0.05);
                }
                if (gamepad2.left_bumper) {
                    tower2.setPower(-1);
                    tower.setPower(1);
                }
                if (gamepad2.right_bumper) {
                    tower2.setPower(1);
                    tower.setPower(-1);
                }
                if (!(gamepad2.left_bumper && gamepad2.right_bumper)) {
                    tower2.setPower(0.05);
                    tower.setPower(0);
                }
                if (gamepad2.a) {
                    clawcontrol.setPower(1);
                    sleep(500);
                    clawcontrol.setPower(0.001);
                }
                if (gamepad2.y) {
                    clawcontrol.setPower(-1);
                    sleep(500);
                    clawcontrol.setPower(-0.1);
                }
                if (gamepad2.x) {
                    intake.setPower(1);
                }
                if (gamepad2.b) {
                    intake.setPower(-1);
                }
            }
        }
    }
}