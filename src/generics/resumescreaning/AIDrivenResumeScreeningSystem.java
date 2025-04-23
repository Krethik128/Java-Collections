package generics.resumescreaning;

import java.util.ArrayList;
import java.util.List;

class AIDrivenResumeScreeningSystem {
    public static void processResumes(List<? extends JobRole> rolesToScreen, List<Resume<? extends JobRole>> resumes) {
        System.out.println("--- Starting Resume Screening ---");
        for (Resume<? extends JobRole> resume : resumes) {
            boolean shouldProcess = false;
            for (JobRole role : rolesToScreen) {
                if (resume.getJobRole().getClass().equals(role.getClass())) {
                    shouldProcess = true;
                    break;
                }
            }
            if (shouldProcess) {
                resume.process();
            } else {
                System.out.println("Skipping resume for " + resume.getApplicantName() + " as no matching role to screen for.");
            }
            System.out.println("---");
        }
        System.out.println("--- Resume Screening Complete ---");
    }

    public static void main(String[] args) {
        List<JobRole> rolesToScreen = new ArrayList<>();
        rolesToScreen.add(new SoftwareEngineer());
        rolesToScreen.add(new DataScientist());

        List<Resume<? extends JobRole>> resumes = new ArrayList<>();
        resumes.add(new Resume<>("Alice", new SoftwareEngineer(), "Experience in Java, Spring, and software development."));
        resumes.add(new Resume<>("Bob", new DataScientist(), "Background in machine learning, Python, and data analysis."));
        resumes.add(new Resume<>("Charlie", new ProductManager(), "Managed product roadmaps and user stories."));
        resumes.add(new Resume<>("Diana", new SoftwareEngineer(), "Proficient in C++, algorithms, and system design."));

        processResumes(rolesToScreen, resumes);
    }
}
