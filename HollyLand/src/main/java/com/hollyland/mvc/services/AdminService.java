package com.hollyland.mvc.services;

import org.springframework.stereotype.Service;

import com.hollyland.mvc.repositories.AdminRepository;
import com.hollyland.mvc.repositories.CityRepository;
import com.hollyland.mvc.repositories.ImageRepository;
import com.hollyland.mvc.repositories.MessageRepository;
import com.hollyland.mvc.repositories.ReportRepository;
import com.hollyland.mvc.repositories.VillageRepository;

@Service
public class AdminService {
	private final AdminRepository adminRepository;
	private final CityRepository cityRepository;
	private final ImageRepository imageRepository;
	private final MessageRepository messageRepository;
	private final ReportRepository reportRepository;
	private final VillageRepository villageRepository;
	
	public AdminService(AdminRepository adminRepository, CityRepository cityRepository,
			ImageRepository imageRepository, MessageRepository messageRepository,
			ReportRepository reportRepository, VillageRepository villageRepository) {
		this.adminRepository = adminRepository;
		this.cityRepository = cityRepository;
		this.imageRepository = imageRepository;
		this.messageRepository = messageRepository;
		this.reportRepository = reportRepository;
		this.villageRepository = villageRepository;
	}
}
