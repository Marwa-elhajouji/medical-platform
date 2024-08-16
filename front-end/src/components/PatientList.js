// src/components/PatientList.js
import React, { useState, useEffect } from 'react';
import PatientService from '../services/PatientService';

function PatientList() {
    const [patients, setPatients] = useState([]);

    useEffect(() => {
        PatientService.getPatients().then((res) => {
            setPatients(res.data);
        });
    }, []);

    return (
        <div>
            <h2>Patients</h2>
            <ul>
                {patients.map(patient => (
                    <li key={patient.id}>{patient.name} - {patient.email}</li>
                ))}
            </ul>
        </div>
    );
}

export default PatientList;
