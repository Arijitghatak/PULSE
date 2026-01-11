# 🔵 Pulse — Real-Time Java Chat App

Pulse is a **desktop chat application** built using **Java sockets and Swing**.  
It allows two processes to communicate in real time over a TCP connection.

This project focuses on **core networking and system design**, not frameworks.

---

## ✨ What Pulse Does

- Sends and receives messages in real time  
- Uses a true **client–server architecture**  
- Handles disconnects properly  
- Displays messages in a modern dark-themed chat UI  

---

## 🚫 What Pulse Does NOT Do

Pulse is intentionally simple.

It does **not** include:
- User accounts or login  
- Database or message storage  
- Encryption or security layers  
- Group chats or multiple clients  
- Cloud hosting  

This keeps the focus on **how networking actually works** instead of hiding it behind libraries.

---

## 🧰 Tech Stack

- **Java** (Core)
- **Java Sockets** (`java.net`)
- **Multi-threading**
- **Swing GUI**
- **Git & GitHub**

---

## 🧠 What I Learned

- How TCP socket communication really works  
- How clients and servers stay in sync  
- Handling blocking I/O and threads  
- Detecting and managing disconnects  
- Connecting backend logic to a desktop UI  
- Debugging real-world networking bugs  

---

## ▶️ How to Run

Start the server:
```bash
javac Server/Server.java
java Server.Server

javac Client/*.java
java Client.Main

👤 Author

Arijit Ghatak
CS Student — building real systems to understand how they actually work 💻
