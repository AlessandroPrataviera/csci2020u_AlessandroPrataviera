package sample;

public class StudentRecord {
    private String SID;
    private Float assignments;
    private Float Midterm;
    private Float FinalExam;
    private Float FinalMark;
    private String LetterGrade;

    public StudentRecord(String SID, Float Midterm, Float assignments, Float FinalExam, Float FinalMark,String LetterGrade) {
        this.SID = SID;
        this.assignments = assignments;
        this.Midterm = Midterm;
        this.FinalExam = FinalExam;
        this.FinalMark = FinalMark;
        this.LetterGrade = LetterGrade;
    }

    public String getSID() { return this.SID;}
    public Float getAssignments() { return this.assignments;}
    public Float getMidterm() { return this.Midterm;}
    public Float getFinalExam() { return this.FinalExam;}
    public Float getFinalMark() { return this.FinalMark;}
    public String getLetterGrade() { return this.LetterGrade;}
}
