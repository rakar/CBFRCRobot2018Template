package frc.team555.Sample;

import org.montclairrobotics.cyborg.Cyborg;
import org.montclairrobotics.cyborg.devices.CBHardwareAdapter;

public class RobotCB extends Cyborg {

    // constants
    // joystick ports
    private final int driveStickID = 0;
    private final int operatorStickID = 1;

    //DeviceID pdb,...

    public RobotCB() {
    }

    @Override
    public void cyborgInit() {

        // data init
        //requestData = new RequestData();
        //controlData = new ControlData();
        //requestData.driveData = new CBStdDriveRequestData();
        //controlData.driveData = new CBStdDriveControlData();

        defineDevices();
        defineMappers();
        defineControllers();
        defineBehaviors();
    }

    @Override
    public void cyborgDisabledInit() {

    }

    @Override
    public void cyborgAutonomousInit() {
    }

    @Override
    public void cyborgTeleopInit() {

    }

    @Override
    public void cyborgTestInit() {

    }

    private void defineDevices() {
        // Configure Hardware Adapter and Devices
        hardwareAdapter = new CBHardwareAdapter(this);
    }

    private void defineMappers() {
    }

    private void defineControllers() {
    }

    private void defineBehaviors() {
    }
}
