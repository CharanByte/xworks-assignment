package com.xworkz.collections.dto.runner;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.xworkz.collections.dto.WeaponDTO;

public class weaponDTORunner {

	public static void main(String[] args) {

		WeaponDTO weapon1 = new WeaponDTO(1, "AK-47", "Russia", 2023);
		WeaponDTO weapon2 = new WeaponDTO(2, "M16", "USA", 2024);
		WeaponDTO weapon3 = new WeaponDTO(3, "Glock 17", "Austria", 2000);
		WeaponDTO weapon4 = new WeaponDTO(4, "FN SCAR", "Belgium", 2009);
		WeaponDTO weapon5 = new WeaponDTO(5, "Heckler & Koch MP5", "Germany", 2024);
		WeaponDTO weapon6 = new WeaponDTO(6, "SIG Sauer P226", "Switzerland", 1984);
		WeaponDTO weapon7 = new WeaponDTO(7, "Uzi", "Israel", 1954);
		WeaponDTO weapon8 = new WeaponDTO(8, "Steyr AUG", "Austria", 2024);
		WeaponDTO weapon9 = new WeaponDTO(9, "FN FAL", "Belgium", 1953);
		WeaponDTO weapon10 = new WeaponDTO(10, "Beretta 92", "Italy", 2023);

		Set<WeaponDTO> set = new HashSet<WeaponDTO>();
		set.add(weapon1);
		set.add(weapon2);
		set.add(weapon3);
		set.add(weapon4);
		set.add(weapon5);
		set.add(weapon6);
		set.add(weapon7);
		set.add(weapon8);
		set.add(weapon9);
		set.add(weapon10);

		// set.stream().forEach(ref->System.out.println(ref));
		set.stream().filter(ref -> ref.getManfDate() >= 2024).forEach(ref -> System.out.println(ref));

		System.out.println("==================================================");
		set.stream().filter(ref -> ref.getManfDate() < 2024).forEach(ref -> System.out.println(ref));
		System.out.println("==================================================");
		set.stream().sorted((ref1,ref2)->Integer.compare(ref2.getId(), ref1.getId())).forEach(ref->System.out.println(ref));
	}

}
