
# JobCopilot 🚀

A Job Application Tracking Dashboard built to help students organize and manage their internship and job applications.

## ✨ Features

- Dashboard with application statistics
- Add new job applications
- Update application status
- Delete applications
- Search applications by company name
- Filter applications by status
- Persistent data storage using H2 Database
- Basic keyword-based job matching

## 🛠️ Tech Stack

**Backend**
- Java 21
- Spring Boot
- Spring Data JPA
- Maven

**Database**
- H2 Database

**Frontend**
- HTML
- CSS
- JavaScript

## 📁 Project Structure

```text
jobcopilot/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/vanshika/jobcopilot/
│       └── resources/
│           ├── static/
│           │   └── index.html
│           └── application.properties
├── data/
├── pom.xml
└── README.md
```

## ⚙️ Getting Started

### Prerequisites
- Java 21
- Git

### Run Locally

1. Clone the repository:

```bash
git clone YOUR_GITHUB_REPOSITORY_URL
```

2. Open the project folder:

```bash
cd jobcopilot
```

3. Run the application:

```bash
./mvnw spring-boot:run
```

On Windows PowerShell:

```powershell
.\mvnw.cmd spring-boot:run
```

4. Open your browser:

```text
http://localhost:8080
```

## 🔗 API Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | `/api/jobs` | Get all applications |
| POST | `/api/jobs` | Add an application |
| PUT | `/api/jobs/{id}/status` | Update application status |
| DELETE | `/api/jobs/{id}` | Delete an application |

## 💡 Future Improvements

- AI-powered resume and job description matching
- Skill gap analysis
- Interview preparation assistance
- User authentication
- Cloud database integration

## 👩‍💻 Author

Vanshika Chaudhary
