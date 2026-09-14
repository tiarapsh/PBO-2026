package Jobsheet4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Patient {
    private String noMedicalRecord;
    private String name;
    private ArrayList<Consultation> consultationsHistory;

    public String nomedicalRecord() {
        return noMedicalRecord;
    }

    public void setNoMedicalRecord(String noMedicalRecord) {
        this.noMedicalRecord = noMedicalRecord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Patient(String noMedicalRecord, String name) {
        this.noMedicalRecord = noMedicalRecord;
        this.name = name;
        this.consultationsHistory = new ArrayList<>();
    }

      public void addConsultation(LocalDate date, Employee doctor, Employee nurse) {
            Consultation consultation = new Consultation();
            consultation.setDate(date);
            consultation.setDoctor(doctor);
            consultation.setNurse(nurse);
            consultationsHistory.add(consultation);
        }

    public String getInfo(){
        String info = "";
        info += "No Medical Record : " + this.noMedicalRecord + "\n";
        info += "Name              : " + this.name + "\n";
        if (!consultationsHistory.isEmpty()) {
            info += "History Consultation  :\n";

            for (Consultation consultation : consultationsHistory) {
                info += consultation.getInfo() + "\n";
            }
        } else {
            info += "No history consultation yet";
        }
        info += "\n";
        
        return info;
    }
}
