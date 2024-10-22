public class Author {
        private static String getName;
        private String name;
        private String email;
        private char gender;
        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        public String getEmail() {
            return email;
        }
        public char getGender() {
            return gender;
        }
        public String toString() {
            return "Author[" + name + ", " + email + ", " + gender + "]";
        }

        public void setEmail(String email) {
            this.email = email;
        }
        public String getName() {
            return name;
        }
    }
