#  Hiring4U – Job Portal Backend (Spring Boot)

Hiring4U is a role-based Job Portal Backend application built using Spring Boot and MySQL.  
It supports Candidate and Recruiter registration, authentication, and job posting functionality.

---

## 🔥 Features

### 👤 Candidate
- Register account
- Login using Basic Authentication
- View all available jobs
- Apply for jobs

### 🏢 Recruiter
- Register company account
- Login using Basic Authentication
- Post new jobs
- View all posted jobs

### 🔐 Security
- Spring Security with Basic Authentication
- Role-Based Access Control (ADMIN / RECRUITER / CANDIDATE)
- BCrypt Password Encryption
- Secure endpoints with role authorization

---

## 🛠 Tech Stack

- Java 17+
- Spring Boot
- Spring Security
- Spring Data JPA
- MySQL
- Maven
- IntelliJ IDEA
- Postman (API Testing)

---

## 📂 Project Structure

```
com.hiring4u
│
├── controller
├── service
├── repository
├── entity
├── dto
├── security
└── enums
```

---

## 🗄 Database Tables

- candidates
- recruiters
- jobs
- applications

Relationship:
- One Recruiter → Many Jobs
- One Candidate → Many Applications

---

## ⚙️ Setup Instructions

### 1️⃣ Clone Repository

```bash
git clone https://github.com/your-username/hiring4u.git
cd hiring4u
```

### 2️⃣ Configure Database

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/job_portal
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### 3️⃣ Run Application

```bash
mvn spring-boot:run
```

Application runs on:
```
http://localhost:8080
```

---

## 📌 API Endpoints

### Candidate

| Method | Endpoint | Description |
|--------|----------|------------|
| POST | /can/registered | Register Candidate |
| GET | /candidate/jobs | View Jobs |

### Recruiter

| Method | Endpoint | Description |
|--------|----------|------------|
| POST | /rec/registered | Register Recruiter |
| POST | /recruiter/post-job | Post Job |
| GET | /recruiter/home | Recruiter Dashboard |

---

## 🔐 Authentication

Basic Auth is required for secured endpoints.

Use:
- Username = Email
- Password = Registered password

---

## 📈 Future Improvements

- JWT Authentication
- Resume Upload
- Pagination
- Job Search Filters
- Admin Dashboard
- Docker Deployment

---

## 👨‍💻 Author

Mohammad Arif  
Electronics & Communication Engineer  
Java Backend Developer  

---

## ⭐ Contribution

Contributions are welcome.  
Feel free to fork and raise pull requests.

---

## 📜 License

This project is for educational and learning purposes.
