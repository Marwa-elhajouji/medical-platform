import React, { useState, useEffect } from 'react';
import DoctorService from '../services/DoctorService';

function DoctorList() {
    const [doctors, setDoctors] = useState([]);

    useEffect(() => {
        DoctorService.getDoctors().then((res) => {
            setDoctors(res.data);
        });
    }, []);

    return (
        <div>
            <h2>Doctors</h2>
            <ul>
                {doctors.map(doctor => (
                    <li key={doctor.id}>{doctor.name} - {doctor.specialization}</li>
                ))}
            </ul>
        </div>
    );
}

export default DoctorList;
