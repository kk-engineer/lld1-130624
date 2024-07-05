package in.itkaran.lld1130624.lld2.builder.productionbuilder;

public class Student {
    private String name;
    private int age;
    private String batch;
    private double psp;
    private String email;
    private String phoneNo;
    private String univName;
    private int gradYear;

    public Student(Builder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.batch = builder.getBatch();
        this.psp = builder.getPsp();
        this.email = builder.getEmail();
        this.phoneNo = builder.getPhoneNo();
        this.univName = builder.getUnivName();
        this.gradYear = builder.getGradYear();
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private int age;
        private String batch;
        private double psp;
        private String email;
        private String phoneNo;
        private String univName;
        private int gradYear;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        // Setters
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public Builder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        // Build
        public Student build() {
            // Do all validations before building the object
            if (this.getGradYear() < 2022) {
                throw new RuntimeException("Grad year must be 2022 or greater");
            }

            if (this.getPsp() < 70) {
                throw new RuntimeException("PSP must be greater than 70");

            }
            return new Student(this);
        }

        public String getName() {
            return name;
        }

        // Getters
        public int getAge() {
            return age;
        }

        public String getBatch() {
            return batch;
        }

        public double getPsp() {
            return psp;
        }

        public String getEmail() {
            return email;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public String getUnivName() {
            return univName;
        }

        public int getGradYear() {
            return gradYear;
        }
    }
}
