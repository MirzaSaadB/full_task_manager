# 🧠 Full Task Manager - Spring Boot + MySQL + HTML/CSS

A full-featured **Task Manager Web Application** built using **Spring Boot (Java)** for the backend, **MySQL** for database storage, and a responsive, modern **HTML/CSS frontend**.

---

## 🔥 Features

- 🔐 User Signup & Login using email
- ✅ Add, view, update, and delete tasks
- 🌐 Tasks are user-specific
- 🎨 Fully responsive, modern UI with Dark Mode
- 📁 Clean folder structure and separation of concerns
- ⚠️ No authentication/security (for testing only)

---

## 📂 Technologies Used

| Layer        | Tech Stack              |
|--------------|--------------------------|
| Backend      | Spring Boot (Java)       |
| Frontend     | HTML5, CSS3              |
| Database     | MySQL                    |
| Build Tool   | Maven                    |
| IDE          | IntelliJ / VSCode        |
| Styling      | Custom CSS (Modern look) |

---

## 🛠️ Getting Started

### 1. 🔧 Backend Setup

#### 📌 Step 1: Clone the project

git clone https://github.com/your-username/full_task_manager.git
cd full_task_manager
📌 Step 2: Set up MySQL
Create a database in MySQL:

sql
CREATE DATABASE task_manager;
📌 Step 3: Configure application.properties
Inside src/main/resources/application.properties:

properties
spring.datasource.url=jdbc:mysql://localhost:3306/task_manager
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
🔐 Note: Password is not encrypted and there is no session/auth handling yet — suitable only for local testing.

📌 Step 4: Run the project
You can run the project using your IDE (run FullTaskManagerApplication.java) or:

mvn spring-boot:run
2. 🎨 Frontend Setup
All frontend files are in the src/main/resources/static/ folder:

signup.html

login.html

task.html

update.html

styles.css

You can open the HTML files directly in your browser or serve them through Spring Boot.

🗂️ Project Structure

full_task_manager/
├── src/
│   ├── main/
│   │   ├── java/com/example/full_task_manager/
│   │   │   ├── controller/
│   │   │   ├── model/
│   │   │   ├── repository/
│   │   │   ├── service/
│   │   │   └── FullTaskManagerApplication.java
│   │   └── resources/
│   │       ├── static/
│   │       │   ├── *.html
│   │       │   └── styles.css
│   │       └── application.properties
├── .gitignore
├── README.md
└── pom.xml

🔒 Security Note
⚠️ This project is in testing mode only.

No Spring Security or session handling yet

Passwords are stored in plain text

Do NOT deploy this without:

🔐 Spring Security

🔐 Password encryption (e.g., BCrypt)

🔐 Session or JWT management

📈 Future Improvements
Add Spring Security

Encrypt passwords using BCrypt

Toast notifications for success/error

Task sorting/filtering

RESTful API with frontend in React or Angular

🙌 Author
Developed by Saad with help from ChatGPT (OpenAI)
Made with ❤️ in Spring Boot.

📝 License
This project is open source and available under the MIT License.
