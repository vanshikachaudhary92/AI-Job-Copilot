
# AI Job Copilot

AI Job Copilot is a Java Spring Boot web application that helps students manage job applications and prepare for internships.

## Features

- Add and manage job applications
- Track application status: Applied, Interview, Offer, and Rejected
- Dashboard with application statistics
- Skill Match Calculator using keyword matching
- Interview Question Generator using predefined questions
- Save application data in an H2 database

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- HTML, CSS, JavaScript
- Maven

## How to Run

1. Install JDK 21 or a compatible Java version.
2. Clone this repository:

   ```bash
   git clone https://github.com/vanshikachaudhary92/AI-Job-Copilot.git
   ```

3. Open the project folder in VS Code.
4. Run this command in the terminal on Windows:

   ```powershell
   .\mvnw.cmd spring-boot:run
   ```

5. Open http://localhost:8080 in your browser.

## API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/jobs` | View all job applications |
| POST | `/api/jobs` | Add a job application |
| PUT | `/api/jobs/{id}/status?status=Interview` | Update application status |
| DELETE | `/api/jobs/{id}` | Delete an application |

## Future Improvements

- AI-powered resume and job description matching
- Missing-skill recommendations
- AI-generated interview questions and feedback
- Resume analysis

## Author

Vanshika Chaudhary

GitHub: https://github.com/vanshikachaudhary92

---

Note: The current skill matcher uses keyword matching, and the interview question generator uses predefined questions. Real AI integration is planned.
