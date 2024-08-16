import React, { useState, useEffect } from 'react';
import AppointmentService from '../services/AppointmentService';

function AppointmentList() {
    const [appointments, setAppointments] = useState([]);

    useEffect(() => {
        AppointmentService.getAppointments().then((res) => {
            setAppointments(res.data);
        });
    }, []);

    return (
        <div>
            <h2>Appointments</h2>
            <ul>
                {appointments.map(appointment => (
                    <li key={appointment.id}>
                        {appointment.patient.name} with {appointment.doctor.name} at {appointment.appointmentTime}
                    </li>
                ))}
            </ul>
        </div>
    );
}

export default AppointmentList;
