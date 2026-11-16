# Smart City Emergency Response System (SCERS) - Java Implementation

## Overview

SmartRescue 2027 is a Java-based Smart City Emergency Response System (SCERS) developed as Part 2 of the 6FTC2084 Software Architecture module. The system manages urban emergencies from start to finish. This includes the initial incident report by a witness, operator verification, ambulance dispatch, on-scene assistance, and the patient's hospital transfer.

## Architecture

The application follows a layered **3-Tier Architecture** to separate its functions:

- **Presentation Tier:** Contains the Graphical User Interface (GUI) panels for each actor, including the Emergency Reporting UI, Operator Console, Ambulance Team UI, and Hospital Information UI.

- **Logic (Application) Tier:** Implements the core business rules using object-oriented principles. It is divided into four subsystems: User Management, Emergency Management, Ambulance Management, and Hospital Management.

- **Data Tier:** Handles data persistence via a `FileDataStore` class, managing file I/O operations (read, write, search) to store system entities in local files (`users.dat`, `emergencies.dat`, `ambulances.dat`, `hospitals.dat`).

## Key Features

- **Role-Based GUI:** Interactive panels tailored to specific actors to handle expected input and output actions.

- **File-Based Persistence:** Extensible collections that save and load state across sessions using Java file I/O.

- **Exception Handling:** Management of checked exceptions during file reading, writing, and searching operations.

- **Object-Oriented Design:** Direct Java translation of the Part 1 UML class diagram, utilizing inheritance (e.g., abstract `User` class extended by `Witness`, `EmergencyOperator`, and `AmbulanceTeam`) to reduce code duplication.

## Developer

Mohamed Hussien Elsayed Othman  
6FTC2084 Software Architecture (2026/27A)
