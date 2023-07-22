package com.androidalians.androidpoint.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import com.androidalians.androidpoint.R;

public class ProjectList extends AppCompatActivity {
    AppCompatImageView feed_back_arrow;
    TextView title_project;
    ListView l;
    String tutorials[] =
            {
                    "(1)  Tuition Notes Application",
                    "(2)  Intermediate Android Projects",
                    "(3)  Online voting system",
                    "(4)  Train Food Application",
                    "(5)  Women Safety Application",
                    "(6)  Online Vaccination",
                    "(7)  Women Jobs Application",
                    "(8)  E-banking",
                    "(9)  Hostel Management Application",
                    "(10) Ayurvedic Remedies Application",
                    "Photo Management Application",
                    "Women's Security SMS Alert based Appliction",
                    "A Food Wastage Reduction Appliction",
                    "Bus Pass Management System",
                    "News Application",
                    "Billing Appliction",
                    "Chat Appliction",
                    "Quiz Appliction",
                    "Event Registration System with QR Code",
                    "Flutter based Music Player App",
                    "Flutter based Online Auction App",
                    "Flutter Based Online Helpdesk System",
                    "Flutter based Interview Preparation App",
                    "Digital Fare Meter App for Drivers Based on Flutter",
                    "Flutter Based Barter Trading System App",
                    "Money Management App for Expense Planning Flutter",
                    "Elevator Saga: Fun Game Flutter App",
                    "Hangman Game: Vocabulary Building Flutter App",
                    "Secure File Access System Android App",
                    "Brain Tumor and Alzheimer’s Detection Flutter App",
                    "Android Phone Hardware Tester App",
                    "Text Translation App Using Google API",
                    "AI-Based Picture Translation App",
                    "Android File Finder and Sorting App",
                    "Spy Camera Android App",
                    "Bank Beacon Android App",
                    "Android Heart Disease Prediction App",
                    "Android Geofencing App for COVID Quarantine",
                    "Android Carpool Ride Sharing App",
                    "Staff Scheduling Android App",
                    "Wheelchair Guidance & Assistance App",
                    "Herb & Grocery Shopping Android App",
                    "Dementia Virtual Memory App",
                    "Barbershop Service Booking App",
                    "Fitness App With Workout Diet & Motivation",
                    "Emergency Ambulance Booking App",
                    "Doctor Appointment Booking & Live Chat App",
                    "Android Blood Donation & Blood Bank Finder",
                    "Online Driver Hiring Android App",
                    "Retail Store Inventory & POS Checkout App",
                    "Gym Trainer & Progress Tracker App",
                    "Accident Detection & Alert Android App",
                    "Android Personal Safety App",
                    "Android College Connect Chat App",
                    "Tour Recommender App Using Collaborative Filtering",
                    "Instant Plasma Donor Recipient Connector Android App",
                    "Hourly Bicycle Rental Android App",
                    "Android Bookaholics Circle",
                    "Advanced CRM Android Application",
                    "Android Micro Drone With Obstacle Detector",
                    "Android Geo Fencing App for Workforce Tracking",
                    "Android College Attendance System",
                    "Android OCR Snap & Share Application",
                    "Cab Booking Android Application",
                    "Android Food order and delivery app",
                    "Currency Detector App for Visually Impaired",
                    "Android Voice Based Train Time-Table",
                    "Voice Authentication App using Microsoft Cognitive Services",
                    "Organ Donation Android Application",
                    "Smart Home Automation System with Light Dimmer",
                    "Custom Keyboard Android App",
                    "Face Authentication App using Microsoft’s Cognitive Service",
                    "Arduino based Snake Robot Controlled using Android Application",
                    "Daily Route Planner",
                    "Friendly Map Android Application for Disabled People",
                    "Trip Planner Android Application",
                    "Android Paper Free Document Sharing App Project",
                    "Android Smart Sticky Notes Application Project",
                    "Library Management System with SMS Autoreply",
                    "Traffic Rules and Traffic Signs Quiz APP",
                    "Location Finder App using Android Phone & Cloud Vision API",
                    "Android Smart Health Monitoring System",
                    "Android Auction System App Project",
                    "Vehicle Number Plate Recognition using Android",
                    "V App : E College System for Blind Students",
                    "Android Place Marker",
                    "Android Help Assistance Near Me",
                    "Canteen Automation System using Android",
                    "Android Vehicle Tracking with Speed Limiting",
                    "Android based QR Parking Booking",
                    "Multi Restaurant Food Ordering & Management System",
                    "Android Smart Ticketing System using RFID",
                    "Financial Status Analysis Using Credit Score Rating Based On Android",
                    "Android Query Generator",
                    "Android Attendance System Using RFID",
                    "Android General Knowledge Chatbot",
                    "Android Vehicle Toll Payment System",
                    "Android Task Monitoring",
                    " Automated Canteen Ordering System using Android",
                    "RFID Based Automatic Traffic Violation Ticketing",
                    "Android Based Visual Product Identification For The Blind",
                    "Android Offloading Computation Over Cloud",
                    "Railway Ticket Booking System Using QR Codes",
                    "Secure Digi Locker Application",
                    "Android Campus Recruitment System",
                    "Android File Manager Application Project",
                    "Voice Assistant For Visually Impaired",
                    "Your Personal Nutritionist Using FatSecret API",
                    "Mobile Based Attendance System",
                    "Pill Reminder and Medication Tracker using OCR",
                    "Face Detection Using Mobile Vision API",
                    "Child Monitoring System App",
                    "Floating Camera Widget Android",
                    "Android Geo Fencing App Project",
                    "Railway Ticket Booking System Using Qr Code",
                    "Restaurant Table Booking Android Application",
                    "Secure File Sharing Using Access Control",
                    "Android Video Encryption & Sharing",
                    "Android Expiry Reminder App Using OCR",
                    "Android Step Counter App",
                    "Android Boat Crossing Game App",
                    "Calorie Calculator & Suggester Android App",
                    "Android Text Encryption Using Various Algorithms",
                    "Android Smart Ticketing Using Rfid",
                    "Android Battery Saver System",
                    "Android Based Encrypted SMS System",
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_list);

        feed_back_arrow = findViewById(R.id.feed_back_arrow);
        title_project = findViewById(R.id.title_project);

        l = findViewById(R.id.list);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(this,
                com.airbnb.lottie.R.layout.support_simple_spinner_dropdown_item, tutorials);
        l.setAdapter(arr);

        feed_back_arrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProjectList.this, MainActivity.class);
                startActivity(intent);
            }
        });

        title_project.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pro = new Intent(ProjectList.this, AboutUs.class);
                startActivity(pro);
            }
        });
    }
}