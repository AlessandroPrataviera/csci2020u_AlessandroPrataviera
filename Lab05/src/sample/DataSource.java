package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataSource {
    public static ObservableList<StudentRecord> getAllMarks(){
        ObservableList<StudentRecord> marks = FXCollections.observableArrayList();
        // Student ID, Assignments, Midterm, Final exam
        marks.add(new StudentRecord("100100100", 75.0f, 68.0f,54.25f,75.0f*0.3f+68.0f*0.2f+54.25f*0.5f,"C"));
        marks.add(new StudentRecord("100100101",70.0f,69.25f, 51.5f,70.0f*0.3f+69.25f*0.2f+51.5f*0.5f,"C"));
        marks.add(new StudentRecord("100100102",100.0f, 97.0f, 92.5f,100.0f*0.3f+97.0f*0.2f+92.5f*0.5f,"A"));
        marks.add(new StudentRecord("100100103", 90.0f, 88.5f, 68.75f,90.0f*0.3f+88.5f*0.2f+68.75f*0.5f,"B"));
        marks.add(new StudentRecord("100100104", 72.25f, 74.75f,58.25f,72.25f*0.3f+74.75f*0.2f+58.25f*0.5f,"C"));
        marks.add(new StudentRecord("100100105", 85.0f, 56.0f,62.5f,85.0f*0.3f+56.0f*0.2f+62.5f*0.5f,"C"));
        marks.add(new StudentRecord("100100106",70.0f,66.5f, 61.75f,70.0f*0.3f+66.5f*0.2f+61.75f*0.5f,"C"));
        marks.add(new StudentRecord("100100107",55.0f, 47.0f, 50.5f,55.0f*0.3f+47.0f*0.2f+50.5f*0.5f,"D"));
        marks.add(new StudentRecord("100100108", 32.5f, 40.0f,27.75f,32.5f*0.3f+40.0f*0.2f+27.75f*0.5f,"F"));
        marks.add(new StudentRecord("100100109", 82.5f, 77.0f,74.25f,82.5f*0.3f+77.0f*0.2f+74.25f*0.5f,"B"));

        return marks;
    }
}
