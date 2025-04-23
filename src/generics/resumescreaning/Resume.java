package generics.resumescreaning;

class Resume<T extends JobRole> {
    private String applicantName;
    private T jobRole;
    private String content;

    public Resume(String applicantName, T jobRole, String content) {
        this.applicantName = applicantName;
        this.jobRole = jobRole;
        this.content = content;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public T getJobRole() {
        return jobRole;
    }

    public String getContent() {
        return content;
    }

    public void process() {
        System.out.println("Processing resume for: " + applicantName + " (Role: " + jobRole + ")");
        // Simulate AI-driven screening logic
        if (content.contains(jobRole.getRoleName().toLowerCase())) {
            System.out.println("Resume likely relevant for " + jobRole);
        } else {
            System.out.println("Resume might not be a strong match for " + jobRole);
        }
    }
}
