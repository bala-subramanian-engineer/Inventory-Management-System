# Inventory-Management-System

📦 Overview
A comprehensive inventory management system with product tracking, stock alerts, supplier management, and sales monitoring.

🚀 Features
Product Management: Complete CRUD operations for products

Category System: Organize products by categories

Supplier Tracking: Manage product suppliers and contacts

Stock Alerts: Low stock warnings and notifications

Sales Tracking: Record and monitor product sales

Dashboard: Visual overview of inventory status

Responsive Design: Bootstrap 5 mobile-friendly interface

🛠️ Tech Stack
Backend: Spring Boot 3.x, Spring Data JPA, PostgreSQL

Frontend: HTML5, CSS3, JavaScript, Bootstrap 5, Chart.js

Database: PostgreSQL

Build Tool: Maven

📋 Prerequisites
Java 17 or higher

PostgreSQL 12+

Maven 3.6+

Modern web browser

🗄️ Database Setup
sql
CREATE DATABASE inventory_system;

⚙️ Configuration
Update src/main/resources/application.properties:

properties
spring.datasource.url=jdbc:postgresql://localhost:5432/inventory_system
spring.datasource.username=inventory_admin
spring.datasource.password=admin123
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
🚀 Running the Application
Start PostgreSQL service

Run the application:

bash
mvn spring-boot:run
Access dashboard at: http://localhost:8080

API documentation at: http://localhost:8080/swagger-ui.html

📊 API Endpoints
Method	Endpoint	Description
GET	/api/products	Get all products
POST	/api/products	Create new product
PUT	/api/products/{id}	Update product
DELETE	/api/products/{id}	Delete product
GET	/api/products/low-stock	Get low stock items
GET	/api/categories	Get all categories
GET	/api/suppliers	Get all suppliers
🎯 Usage Guide
Add Products: Use the product modal to add inventory items

Set Categories: Organize products into categories for better management

Manage Suppliers: Add supplier information for restocking

Monitor Stock: Dashboard shows low stock alerts automatically

Track Sales: Record sales transactions through the interface

📈 Dashboard Features
Stock Overview: Visual representation of inventory levels

Low Stock Alerts: Highlighted warnings for items needing restock

Quick Actions: Easy access to common operations

Responsive Design: Works on desktop, tablet, and mobile

🔧 Troubleshooting
Database issues: Check PostgreSQL service status and connection string

Build errors: Verify Maven dependencies and Java version

CORS problems: Ensure proper CORS configuration for API calls

🚀 Deployment Notes
Set spring.jpa.hibernate.ddl-auto=validate in production

Configure proper database connection pooling

Enable HTTPS for secure communications

Set up database backups regularly
