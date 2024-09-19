package com.xworkz.standards.service;

import com.xworkz.standards.repo.VehicleRepository;

public class VehicleServiceImp implements VehicleService {
	private VehicleRepository vehicleRepository;

	public VehicleServiceImp(VehicleRepository vehicleRepository) {
		super();
		this.vehicleRepository = vehicleRepository;
	}

	@Override
	public void persist() {
		if (vehicleRepository != null) {
			vehicleRepository.save();
			System.out.println("successfully saved");
			return;
		} else {
			System.out.println("not saved");
		}

	}

	@Override
	public void merge() {
		// TODO Auto-generated method stub
		if (vehicleRepository != null) {
			vehicleRepository.update();
			System.out.println("successfully update");
			return;
		} else {
			System.out.println("not updated");
			return;
		}

	}

	@Override
	public boolean clear() {
		if (vehicleRepository != null) {
			boolean deleted = vehicleRepository.delete();
			if (deleted) {
				System.out.println("successfully deleted");
				return true;
			}
		} else {
			System.out.println("not deleted");
			return false;
		}
		System.out.println("vehicleRepository is null");
		return false;
	}

	@Override
	public String search() {
		if (vehicleRepository != null) {
			String search = vehicleRepository.read();
			if (search != null) {
				System.out.println(" search successfull ");
				return "success";
			} else {
				System.out.println("no search");
				return "failed";
			}
		}
		System.out.println("vehicleRepository is null");
		return "Issue";

	}

}
