package com.capgemini.healthcaresystem.services;
import java.util.List;

import com.capgemini.healthcaresystem.dto.*;
public class ValidateAdminAppointment {
	public boolean validateaAdminApprovement(Appointment appointment)
	{
		if(appointment.isApproved())
			return true;
		else
			return false;
	}
}
